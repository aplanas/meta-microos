SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich)."
LICENSE = "Apache-2.0"

PV = "8.13.15"

RPM_NAME = "libphonenumber8-8.13.15-1.3.aarch64.rpm"
RPM_HASH = "bb41b2934a3a6e667b41dcce8c9916219a98955412b8f87cbdd58249afe02d22faa5764fad6dd7f17b8ca8dd3c6814c57dec80e2af1b75c164fe0eb529d2046d"

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
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm
