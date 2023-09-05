SUMMARY = "A standard C language APIs for BLAS from GNU Scientific Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines. This is part of \
the GNU Scientific Library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas_2_7_1-gnu-hpc-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "0acbe0e3c7dd33b6f50a6800178ffc2ec0e6c990dba18985aef947bc8f1e0f11a01b8e523478e5e70facaef8099285858e75b375c20bda74b6fa23c5d3e1d470"

RPROVIDES:${PN} += "libgslcblas-2-7-1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
gsl-2-7-1-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
lua-lmod"

inherit rpm
