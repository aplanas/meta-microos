SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "qca-qt6-devel-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "46f999a4c8a8b16117a14a7b034d2d775fe33615c7b7496ef59f880cf8e35aecd0f92dc0a6471352e37c6295bf52944afe292ae4f9b108f820a31d1f3c2d9afb"

RPROVIDES:${PN} += "cmake-Qca-qt6 \
qca-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Network \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt6-2 \
libqca-qt6.so.2 \
libstdc++.so.6"

inherit rpm
