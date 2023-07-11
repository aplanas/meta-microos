SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-m2-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "79ec7467554854805af80d33e1ac118074e5bfc1fef6804723954256d3613dddf1a1f864cad81393c108ae2cd5bfa21f15bcf5bdf023f9c359b1a19e62b2b168"

RPROVIDES:${PN} += "gcc13-m2"

RDEPENDS:${PN} += "gcc13 \
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
