SUMMARY = "Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plug-in for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES, and \
AES. \
 \
It can be extended by further plug-ins, for example, with qca-sasl for \
SASL support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.7"

RPM_NAME = "qca-qt5-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "38ee55e263a2ab809b02aaef4b18a4ffba2614350d4f640225360807d6804d8a0a10faf3d3ae371a7ffdca575d498f8b32cca686e1451881b66718914e3ebb37"

RPROVIDES:${PN} += "libqca-gcrypt.so \
libqca-gnupg.so \
libqca-logger.so \
libqca-ossl.so \
libqca-softstore.so \
qca-qt5"

RDEPENDS:${PN} += "gpg2 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libqca-qt5.so.2 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
