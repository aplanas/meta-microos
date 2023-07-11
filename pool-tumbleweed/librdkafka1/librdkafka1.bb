SUMMARY = "A library for changing configuration files"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "librdkafka1-2.1.1-1.2.aarch64.rpm"
RPM_HASH = "aa8b7198293a5ac37dab0dd8265a67ae3d8d900b6a9e5a7e91a9747f7296c3e46b28b8e1736827a0328dea905c7d15dc19b2aa8bf36e62ee56d2fde81518bb45"

RPROVIDES:${PN} += "librdkafka++.so.1 \
librdkafka.so.1 \
librdkafka1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
liblz4.so.1 \
libm.so.6 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
