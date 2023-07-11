SUMMARY = "Utility to print an X window dump"
DESCRIPTION = "xpr takes as input a window dump file produced by xwd \
and formats it for output on various types of printers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "xpr-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "66568ec0068ae9ac09f3099903276dd731d7b7b771655485b01dbf4b376786172c7fbe904cc9797e4f9fac43d32ac9c763a67404da2385d636e21743fbcee396"

RPROVIDES:${PN} += "xpr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
