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

RPM_NAME = "qca-qt6-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "5412854d0e87b336c96ac3ce477b979dfc0c75a356d56008cdd15d9d56c99a916d9abea9effa0cc81d24c27521fc788fc1f3891a125615e4dad46a2e2ea8193e"

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
