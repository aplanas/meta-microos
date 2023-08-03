SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.7"

RPM_NAME = "qca-qt6-devel-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "395f9f6882aab4a48986cc674db0bdd7897d63cf5aa61cf39b54559077a0881224a057187a8c9bd8c1eca20c25fa938f3ba1f40eda6dab2186f8193ee18edf16"

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
