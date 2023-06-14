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

RPM_NAME = "qca-qt6-plugins-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "f783004f421d74462cf1cacad85f3ef9260fa729f7bb63b2e820475983f0ef346171f510d5fcd421f934d924d2c9cd4d7979cc21849164bfbfe7f6a7c17bba12"

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
