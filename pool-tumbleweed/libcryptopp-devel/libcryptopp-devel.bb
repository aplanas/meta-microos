SUMMARY = "Development files for libcryptopp, a cryptographic library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto. This package is used for crypto++ development."
LICENSE = "BSL-1.0"

PV = "8.7.0"

RPM_NAME = "libcryptopp-devel-8.7.0-1.3.aarch64.rpm"
RPM_HASH = "500f3cb56a469456989618e2007e598fe161d3eed493a31446a7587f922ce3a5bd90471b1a03f3a0d5af50c23edaccdb520217837dca983a47a42029ad0dda17"

RPROVIDES:${PN} += "libcryptopp-devel \
libcryptopp-devel(aarch-64) \
pkgconfig(cryptopp)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptopp8_7_0"

inherit rpm
