SUMMARY = "Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plug-in for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES, and \
AES. \
 \
It can be extended by further plug-ins, for example, with qca-sasl for \
SASL support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "qca-qt5-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "7fdffd90149234fe611d80a5f0853c41a50c2a9d0113ca826bd8bc0cdbf1efab766f87c613fc914ed14b145b2202f56076e83a5ede5c1e4bb975d4b1d1198264"

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
