SUMMARY = "Development files for libcryptopp, a cryptographic library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto. This package is used for crypto++ development."
LICENSE = "BSL-1.0"

PV = "8.7.0"

RPM_NAME = "libcryptopp-devel-8.7.0-1.4.aarch64.rpm"
RPM_HASH = "73eba3f1d3a838977da0af646c05c92112bbfa8f2a50abc15bd1d21ac64cff5ffd61c8e113566c3b5b0e6978c38d6645ca31c62cfa5fe89a0874602cc471d67d"

RPROVIDES:${PN} += "libcryptopp-devel \
pkgconfig-cryptopp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptopp8-7-0"

inherit rpm
