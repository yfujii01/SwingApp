package com.fj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {

    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JTextField textField2;

    public Form1() {
        // フォームの設定
        setBounds(0, 0, 600, 400);
        setDefaultCloseOperation(Form1.EXIT_ON_CLOSE);
        panel1.setSize(600, 600);
        setContentPane(panel1);
        pack();
        // フォームを表示
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ボタンがクリックされた！");
                String text1 = textField1.getText();
                System.out.println(text1 + "が入力された");
                textField2.setText(text1);
            }
        });
    }
}
