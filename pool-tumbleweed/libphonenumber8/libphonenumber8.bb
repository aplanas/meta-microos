SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich)."
LICENSE = "Apache-2.0"

PV = "8.12.23"

RPM_NAME = "libphonenumber8-8.12.23-1.30.aarch64.rpm"
RPM_HASH = "c176c642274abf216692d342e3fd7a4b627ef59dd0753744a51cdb05e2e243d69784c3947fbe0c12967e0fbd17dbc0193bee7b08daa0ee1ddc8fe0e6194875e8"

RPROVIDES:${PN} += "libphonenumber.so.8 \
libphonenumber8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
