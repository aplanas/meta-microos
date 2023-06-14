SUMMARY = "A library for changing configuration files"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "librdkafka1-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "48c93eaabc57e5747fa267b311bc7ca8df68aa0841f3be2387819ef46b004227e8b81477b764db7815d16fa43f5e7389973c9da5dd662d3842c552f3574ffdce"

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
