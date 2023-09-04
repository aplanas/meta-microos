SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-m2-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "31e55780eac3f7fd87cc03a81080290cc7ef68777a26e84e499d7c7b785c0507b77dc60645791179fe19820f17819d02076c0bad3b22be21bb14f1a1f08b68a0"

RPROVIDES:${PN} += "gcc13-m2"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm2cor18 \
libm2iso18 \
libm2log18 \
libm2min18 \
libm2pim18 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
