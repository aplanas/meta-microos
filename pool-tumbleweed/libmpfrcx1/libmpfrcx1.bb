SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "MPFRCX is a library for the arithmetic of univariate polynomials over \
arbitrary precision real or complex numbers, without control on the \
rounding. \
 \
The motivation for the library is to have functionality available for \
the floating-point approach to complex multiplication. \
Asymptotically-fast routines such as Toom–Cook and the FFT for \
multiplication of polynomials are available, as well as fast routines \
for interpolation and evaluation based on trees of polynomials."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "libmpfrcx1-0.6.3-1.7.aarch64.rpm"
RPM_HASH = "0ab4d4246a3ef674b07a0d276b68dc3efc43eb2c99664869ebbc4b41470008aa2b36dcfada2dfcf5813c68e3ceaa5e14035ca1b4f3149e6794b09a72fc1e02d8"

RPROVIDES:${PN} += "libmpfrcx.so.1 \
libmpfrcx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libmpc.so.3 \
libmpfr.so.6"

inherit rpm
