SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "MPFI is a C library for arbitrary precision interval arithmetic with \
intervals represented using MPFR reliable floating-point numbers. \
 \
The purpose of an arbitrary precision interval arithmetic is on the \
one hand to get 'guaranteed' results, thanks to interval computation, \
and on the other hand to obtain accurate results, thanks to multiple \
precision arithmetic."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "libmpfi0-1.5.4-1.14.aarch64.rpm"
RPM_HASH = "47e90f702294a2244321202616ebebd6f2e336e90ef90371d0786d52fe5259bf2f6dd7500e05aba364d039fcfb0804e4b39accc82999c577a77d34144c903192"

RPROVIDES:${PN} += "libmpfi.so.0 \
libmpfi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libmpfr.so.6"

inherit rpm
