SUMMARY = "The GNU multiple-precision floating-point shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "libmpfr6-4.2.0-3.2.aarch64.rpm"
RPM_HASH = "486afee6a4dd6533c6a08247b61e41cdd416f9ef5a73b526cdf12d340a3ed0f92c09ec0dd664dc03aa8654eefbd9c19e030f32af8a8a8952c16aa50abc284d1a"

RPROVIDES:${PN} += "libmpfr.so.6 \
libmpfr6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
