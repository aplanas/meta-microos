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

RPM_NAME = "qca-qt6-plugins-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "77a6856555b192ca1edeac597c72296ce4182efab5e9ee70e139fee9f8eb3f8da91bc26d597b3a4720fb670a25088f8ec9e903c219fe552e65dffeb50925226b"

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
