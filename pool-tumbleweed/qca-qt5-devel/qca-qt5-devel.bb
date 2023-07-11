SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "qca-qt5-devel-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "4af30c8354d92e866e422b30af6d24a421f4331c6986fe40739e4b7d9a019d07e5cd6a571e0d52a493c96227c30e254123c45ecf3ebf35950b724e7e0c699c99"

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
