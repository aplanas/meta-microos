SUMMARY = "Cryptographic base library for mbedtls"
DESCRIPTION = "This subpackage of mbedtls contains a library that exposes \
cryptographic ciphers, hashes, algorithms and format support such as \
AES, MD5, SHA, Elliptic Curves, BigNum, PKCS, ASN.1, BASE64."
LICENSE = "Apache-2.0"

PV = "2.28.3"

RPM_NAME = "libmbedcrypto7-2.28.3-2.1.aarch64.rpm"
RPM_HASH = "a09d8e88d4a809722c22058cc8403e3ec827fc4b6ac6660c06ca971d18d988069efe462dc9005a909b3dd7eddbd87e9981568c8057e6ce8546b85d0069a4f24a"

RPROVIDES:${PN} += "libmbedcrypto.so.7()(64bit) \
libmbedcrypto7 \
libmbedcrypto7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
