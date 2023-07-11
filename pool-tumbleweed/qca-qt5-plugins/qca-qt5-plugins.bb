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

RPM_NAME = "qca-qt5-plugins-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "6bb2124348bd8036af9d2a78cb55f1eec74e63a63fd12acd9ace08db4019e62eb01df4d0ab1297a36e04b94252a27914b48b46dab719525fa04c4f4f2a0ec62d"

RPROVIDES:${PN} += "libqca-cyrus-sasl.so \
libqca-nss.so \
libqca-pkcs11.so \
libqca-qt5-plugins \
qca-qt5-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libnss3.so \
libpkcs11-helper.so.1 \
libqca-qt5.so.2 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
