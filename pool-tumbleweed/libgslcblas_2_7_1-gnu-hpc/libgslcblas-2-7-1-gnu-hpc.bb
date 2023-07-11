SUMMARY = "A standard C language APIs for BLAS from GNU Scientific Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines. This is part of \
the GNU Scientific Library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas_2_7_1-gnu-hpc-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "b67b3a701b427f473c1adedf76c5a4bff734d3cfd48bbe41e5f05312e805fe335e31a7397b2486731683b6326583d89d84b30ebf2c9019bead7ab6cf839508fd"

RPROVIDES:${PN} += "libgslcblas-2-7-1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
gsl-2-7-1-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
lua-lmod"

inherit rpm
