SUMMARY = "Development files for the Kafka C/C++ library"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support. \
 \
This package contains development headers and examples."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "librdkafka-devel-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "bae09b8dd5eb9240dd27a1d39219bc09a3ca6d55d2600dad3371065f707772d73106abdf6ddf2fb96b31cd5f1ec6a96fb9b19e26a65ff9870c96e780a8e30195"

RPROVIDES:${PN} += "librdkafka-devel \
librdkafka-devel(aarch-64) \
pkgconfig(rdkafka) \
pkgconfig(rdkafka++) \
pkgconfig(rdkafka++-static) \
pkgconfig(rdkafka-static)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
librdkafka1 \
pkgconfig(libcrypto) \
pkgconfig(libcurl) \
pkgconfig(liblz4) \
pkgconfig(libsasl2) \
pkgconfig(libssl) \
pkgconfig(libzstd) \
pkgconfig(rdkafka) \
pkgconfig(rdkafka-static) \
pkgconfig(zlib)"

inherit rpm
