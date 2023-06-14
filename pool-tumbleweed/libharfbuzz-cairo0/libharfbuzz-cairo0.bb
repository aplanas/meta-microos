SUMMARY = "Cairo integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the Cairo library."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "libharfbuzz-cairo0-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "f95b0fd146fdfdfdbd4cea9559eff06a24dea44542213c5b8e5e1cbcb4f5f855e9ec40dbbad2dfc3be478d5ff18409c8ea5de7d48837cf1c6b5a39a4fd75c96e"

RPROVIDES:${PN} += "libharfbuzz-cairo.so.0 \
libharfbuzz-cairo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
