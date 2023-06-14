SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "qca-qt5-devel-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "38dd772f8745f6ba736275f6bffc593bb324d774dd91845b4888477d5c5b10474cd773825e1d81b07ef6be9b9bfecafaddf24c8d8109cbbb2b7ffb8bab672a4e"

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
