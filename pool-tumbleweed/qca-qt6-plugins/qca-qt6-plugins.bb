SUMMARY = "Various plugins for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plug-in for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES, and \
AES. \
 \
It can be extended by further plug-ins, for example, with qca-sasl for \
SASL support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "qca-qt6-plugins-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "5f714dca2d097e7426ad5c5f78ce5844bb7238ed4e431411f1507f994f79a5280d117e3f7be928d51be426ade3279bd78932625d97d4ff7f4499ca120ab4c4ed"

RPROVIDES:${PN} += "libqca-cyrus-sasl.so \
libqca-nss.so \
libqca-pkcs11.so \
qca-qt6-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libnss3.so \
libpkcs11-helper.so.1 \
libqca-qt6.so.2 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
