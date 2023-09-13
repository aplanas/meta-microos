SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich)."
LICENSE = "Apache-2.0"

PV = "8.13.15"

RPM_NAME = "libphonenumber8-8.13.15-1.4.aarch64.rpm"
RPM_HASH = "14717b82f2c4eb9ef0e8e478a7e181961c45af08bfe315db6bc76f4b4ebef52c3ed30427c497ecfb3d75b674c1651a85cb8b5ab345c67e24584a0d00f98c5820"

RPROVIDES:${PN} += "libphonenumber.so.8 \
libphonenumber8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm
