SUMMARY = "Cryptographic base library for mbedtls"
DESCRIPTION = "This subpackage of mbedtls contains a library that exposes \
cryptographic ciphers, hashes, algorithms and format support such as \
AES, MD5, SHA, Elliptic Curves, BigNum, PKCS, ASN.1, BASE64."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "libmbedcrypto14-3.4.1-1.1.aarch64.rpm"
RPM_HASH = "cb41d2171798d5cb8a7c90397e1235237544dce16bde056a0e3c687b8509cf8b7cd37fd8ecba27497ce2af5765e08bf35c0e852a6e3f401df85f455d4004adea"

RPROVIDES:${PN} += "libmbedcrypto.so.14 \
libmbedcrypto14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
