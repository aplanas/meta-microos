SUMMARY = "A library for changing configuration files"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "librdkafka1-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "48c93eaabc57e5747fa267b311bc7ca8df68aa0841f3be2387819ef46b004227e8b81477b764db7815d16fa43f5e7389973c9da5dd662d3842c552f3574ffdce"

RPROVIDES:${PN} += "librdkafka++.so.1()(64bit) \
librdkafka.so.1()(64bit) \
librdkafka1 \
librdkafka1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
