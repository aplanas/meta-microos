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

RPM_NAME = "qca-qt6-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "0da70639f7112aebc696f2a5a4c81dcdb109001fe381c5bd1d51039bc95098a581cc6bd2e83be9027abf1b2786ef32c4c0ac2d836db97d074cf7100f8c10e143"

RPROVIDES:${PN} += "libqca-gcrypt.so \
libqca-gnupg.so \
libqca-logger.so \
libqca-ossl.so \
libqca-softstore.so \
qca-qt6"

RDEPENDS:${PN} += "gpg2 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libqca-qt6.so.2 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
