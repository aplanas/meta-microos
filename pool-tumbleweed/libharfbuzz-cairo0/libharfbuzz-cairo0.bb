SUMMARY = "Cairo integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the Cairo library."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "libharfbuzz-cairo0-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "67b37541b0b3fe58682adfac0af5d2b32082d666e0bdca1750919edc054f8784d41a2b58588ca4e6daa462fd441087d4aeb3b2ab489c63742d98846f2c24e087"

RPROVIDES:${PN} += "libharfbuzz-cairo.so.0 \
libharfbuzz-cairo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
