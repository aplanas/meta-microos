SUMMARY = "The GNU multiple-precision floating-point shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "libmpfr6-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "a0668ce43cdd16b9dda387a52bb49e46bceb7f5772ccbcc291f2182d460f55c81b92b03cf2e876fa199e085e9c0dba71d680aa4dc02942fa813053e65618ec77"

RPROVIDES:${PN} += "libmpfr.so.6()(64bit) \
libmpfr6 \
libmpfr6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit)"

inherit rpm
