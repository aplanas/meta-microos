SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.7"

RPM_NAME = "qca-qt5-devel-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "210b10a8338f5eb2f2967243cf96502df81f288ff71aa15f3bc13e22111f397bb6acc7e60e0b40994f4d83e45933dfd00668d965768b46bd965049ee462bc9c6"

RPROVIDES:${PN} += "cmake-Qca-qt5 \
libqca-qt5-devel \
pkgconfig-qca2-qt5 \
qca-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
cmake-Qt5Network \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt5-2 \
libqca-qt5.so.2 \
libstdc++.so.6 \
pkgconfig-Qt5Core"

inherit rpm
