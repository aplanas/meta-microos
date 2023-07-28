SUMMARY = "Development files for libcryptopp, a cryptographic library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto. This package is used for crypto++ development."
LICENSE = "BSL-1.0"

PV = "8.8.0"

RPM_NAME = "libcryptopp-devel-8.8.0-1.1.aarch64.rpm"
RPM_HASH = "f2800199fe1ac00ba0f1474483c85ff2188894c45a18635fab98629b36c7007969664c0eff124292f179bb396deecbd23623115184198650ec46e57f97236380"

RPROVIDES:${PN} += "libcryptopp-devel \
pkgconfig-cryptopp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptopp8-8-0"

inherit rpm
