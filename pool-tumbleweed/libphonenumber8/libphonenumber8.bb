SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich)."
LICENSE = "Apache-2.0"

PV = "8.13.15"

RPM_NAME = "libphonenumber8-8.13.15-1.2.aarch64.rpm"
RPM_HASH = "dceb5f63807f3db60ba5ef05b3a0389d5555559265dcc1e0e85983865dc9938ca0c06a92cefb8a21c3dd1e24d1f5734fe071d1a234c4aeb930b2f391c536ae06"

RPROVIDES:${PN} += "libphonenumber.so.8 \
libphonenumber8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libprotobuf.so.23.3.0 \
libstdc++.so.6"

inherit rpm
