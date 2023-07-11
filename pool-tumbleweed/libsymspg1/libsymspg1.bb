SUMMARY = "The shared library for SPGLIB"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "libsymspg1-2.0.2-1.4.aarch64.rpm"
RPM_HASH = "ec82516d40527b143237f033a6d7fc9a93bf0bb3f5e9b82c5b2e26333efbb2df99aa5dcd8ace36081734e2e502e54854741d3056888997047d3631ad7b1bace2"

RPROVIDES:${PN} += "libsymspg.so.1 \
libsymspg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
