SUMMARY = "Various plugins for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plug-in for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES, and \
AES. \
 \
It can be extended by further plug-ins, for example, with qca-sasl for \
SASL support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.7"

RPM_NAME = "qca-qt5-plugins-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "3e6fa850937346514ef0870abaa97a6ee7187bbbcb222f60cb8977b962fa2e1ab6456db4beeafafafedeab5a60e7ce7f6375c9c2dda333a6779d3be2df20a518"

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
