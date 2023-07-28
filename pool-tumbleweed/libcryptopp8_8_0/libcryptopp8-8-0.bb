SUMMARY = "Cryptographic Library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto."
LICENSE = "BSL-1.0"

PV = "8.8.0"

RPM_NAME = "libcryptopp8_8_0-8.8.0-1.1.aarch64.rpm"
RPM_HASH = "5b4f99cb05036d6335a03ec9b25f2be345a8edb912be7ba7deb0bfa70c4e39e9369658e55cc579f1ec37cd3ef90925110ae0ded1867e8331bdcbf80a8b518e92"

RPROVIDES:${PN} += "libcryptopp.so.8.8.0 \
libcryptopp8-8-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
