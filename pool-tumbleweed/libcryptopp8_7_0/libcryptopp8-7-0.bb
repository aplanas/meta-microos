SUMMARY = "Cryptographic Library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto."
LICENSE = "BSL-1.0"

PV = "8.7.0"

RPM_NAME = "libcryptopp8_7_0-8.7.0-1.4.aarch64.rpm"
RPM_HASH = "0aa072a0b157efdcd733ece55d6b6c5f2e4399354263431cc1a6e907f3e00b4807185c9be7f675591d933d03f7636409762074b6a4d254e39057ef9966b76b9f"

RPROVIDES:${PN} += "libcryptopp.so.8.7.0 \
libcryptopp8-7-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
