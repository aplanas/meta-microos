SUMMARY = "The GNU multiple-precision floating-point shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "libmpfr6-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "465051583d68cb0a8d53adacbc46e618504d5f2e4d0be207e0c0d5128fa31fb013b7895746b74948d57ac41da025d8006d270f02cea16769d85f3f706d82d86e"

RPROVIDES:${PN} += "libmpfr.so.6 \
libmpfr6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
