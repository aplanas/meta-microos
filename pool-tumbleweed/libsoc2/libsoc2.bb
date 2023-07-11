SUMMARY = "C library for interfacing with common SoC peripherals"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
It targets reliability rather than speed. No guarantees are made \
on its determinism and it should not be used in time critical routines."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc2-0.8.2-3.14.aarch64.rpm"
RPM_HASH = "7e10af0f16548d042f5fa48c306f5855a7812967c4f1b375a0b5c3cb4b2190c0abeb9e6bf7df1c635403b43717c972dd2ccd2c30540523189a5ed1106214b1ff"

RPROVIDES:${PN} += "libsoc.so.2 \
libsoc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
