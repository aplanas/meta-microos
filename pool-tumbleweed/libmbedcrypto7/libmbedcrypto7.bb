SUMMARY = "Cryptographic base library for mbedtls"
DESCRIPTION = "This subpackage of mbedtls contains a library that exposes \
cryptographic ciphers, hashes, algorithms and format support such as \
AES, MD5, SHA, Elliptic Curves, BigNum, PKCS, ASN.1, BASE64."
LICENSE = "Apache-2.0"

PV = "2.28.4"

RPM_NAME = "libmbedcrypto7-2.28.4-1.1.aarch64.rpm"
RPM_HASH = "f21c246a9848f4f45a061fe76db4f8bb3e182de8f18ffa61b948875c6a6a9376af0430c515cccfbb785df4aa20d6436e17a3d0a117b051cb59cc9a82f296f3cd"

RPROVIDES:${PN} += "libmbedcrypto.so.7 \
libmbedcrypto7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
