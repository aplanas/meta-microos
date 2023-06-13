SUMMARY = "Cryptographic Library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto."
LICENSE = "BSL-1.0"

PV = "8.7.0"

RPM_NAME = "libcryptopp8_7_0-8.7.0-1.3.aarch64.rpm"
RPM_HASH = "894e8ac842bc3b64112767763dbaacae68279ffa2f8476073517184b0db908ce7715a1dcda52806f5bb1c2d784f5b32e61e93a7240d78f4ff43d39169eaf0d15"

RPROVIDES:${PN} += "libcryptopp.so.8.7.0()(64bit) \
libcryptopp8_7_0 \
libcryptopp8_7_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
