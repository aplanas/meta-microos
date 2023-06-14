SUMMARY = "Development files for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plugin for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES and AES."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "qca-qt6-devel-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "f74c4ee38328cd557cca15aa3dd7881f36a145da8f5909fc598971946141375a9d9d291fcc18f6ae1e4f4a20705e7baa60baa4d6355d4ad3add8518b50688681"

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
