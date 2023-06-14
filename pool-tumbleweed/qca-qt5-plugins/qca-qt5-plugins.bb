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

RPM_NAME = "qca-qt5-plugins-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "e8081566600f73b41747d65e5ee8a6918201742752d1b30d7d60089f5e64367ad0c7d3022e572fb62dc441486116dcc203304a7047b17a247dd0d835c6ae7285"

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
