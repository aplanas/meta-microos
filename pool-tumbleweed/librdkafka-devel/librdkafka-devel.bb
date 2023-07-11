SUMMARY = "Development files for the Kafka C/C++ library"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support. \
 \
This package contains development headers and examples."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "librdkafka-devel-2.1.1-1.2.aarch64.rpm"
RPM_HASH = "5af2ca6132faa9b3dd370174cc275e32053a2946343b76cd6e00ae3bc1b0278ca80aec42a6c2841d40275cd0cd3df123fd9f699318ee960776b2e641df3c72f7"

RPROVIDES:${PN} += "librdkafka-devel \
pkgconfig-rdkafka \
pkgconfig-rdkafka++ \
pkgconfig-rdkafka++-static \
pkgconfig-rdkafka-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librdkafka1 \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-liblz4 \
pkgconfig-libsasl2 \
pkgconfig-libssl \
pkgconfig-libzstd \
pkgconfig-rdkafka \
pkgconfig-rdkafka-static \
pkgconfig-zlib"

inherit rpm
