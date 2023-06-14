SUMMARY = "C library for doing number theory"
DESCRIPTION = "FLINT (Fast Library for Number Theory) is a C library in support of \
computations in number theory. It is also a research project into \
algorithms in number theory. At this stage, FLINT consists mainly of \
fast integer and polynomial arithmetic and linear algebra."
LICENSE = "LGPL-2.1-or-later"

PV = "2.9.0"

RPM_NAME = "libflint17-2.9.0-2.1.aarch64.rpm"
RPM_HASH = "2b99026e3f56a667d5b16afda3e6adb8fda88f5777b1eff50e4a9500bc920a2a56a7a2f70d6fd4091b008d08992a76059d080080a834c00dec4fd23a68151468"

RPROVIDES:${PN} += "libflint.so.17 \
libflint17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libntl.so.44 \
libstdc++.so.6"

inherit rpm
