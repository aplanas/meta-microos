SUMMARY = "Cairo integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the Cairo library."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "libharfbuzz-cairo0-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "1d1d6182af1b09c5d0f5da44dbf7056a775747ff57dcc9ff31848934f3b89282854336ee1653c762863fba16748e839b3de40b5b47615290897db3881f960323"

RPROVIDES:${PN} += "libharfbuzz-cairo.so.0 \
libharfbuzz-cairo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
