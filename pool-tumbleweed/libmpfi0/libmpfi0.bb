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

RPM_NAME = "libmpfi0-1.5.4-1.15.aarch64.rpm"
RPM_HASH = "c2b94d10a66b5ee6977a6312fbd219d2797517ab6ca1768325a2ea103623a2d96ff311c88c3ddb95f92097c8aafa5abbb1084ba44412bda60b6710006693e378"

RPROVIDES:${PN} += "libmpfi.so.0 \
libmpfi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libmpfr.so.6"

inherit rpm
