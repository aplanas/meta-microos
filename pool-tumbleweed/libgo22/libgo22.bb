SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.2.1+git7683"

RPM_NAME = "libgo22-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "e3208c8525dde16c3c6cfd2f89e4fd1f8990147e1e0c26c86e2c162fb237e589027ffaca57bddecc519826d2338886653d3c5265481455b2d2a50de6e1e5a2ce"

RPROVIDES:${PN} += "libgo.so.22 \
libgo22"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
