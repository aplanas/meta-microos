SUMMARY = "Cryptographic base library for mbedtls"
DESCRIPTION = "This subpackage of mbedtls contains a library that exposes \
cryptographic ciphers, hashes, algorithms and format support such as \
AES, MD5, SHA, Elliptic Curves, BigNum, PKCS, ASN.1, BASE64."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "libmbedcrypto14-3.4.0-3.1.aarch64.rpm"
RPM_HASH = "e6ac9c93ce94bcc78ff81abbbd3d2a97338b70e25531fd19f8adb62b34b2b58a31844c6f34cf7c0e6e3e3ffe0e9b2e6115c543ff09f6b0cd9785bca73f092b0d"

RPROVIDES:${PN} += "libmbedcrypto.so.14 \
libmbedcrypto14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
