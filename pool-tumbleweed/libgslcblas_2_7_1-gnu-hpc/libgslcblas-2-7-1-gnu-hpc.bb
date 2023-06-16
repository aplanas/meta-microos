SUMMARY = "A standard C language APIs for BLAS from GNU Scientific Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines. This is part of \
the GNU Scientific Library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas_2_7_1-gnu-hpc-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "5956ea735e94f020083b2f8d88b134e79a312363aa7ccc1f701ed1e959f1ae1eec0c05d0528c36f5c8970cde3bb0f711e5491d30d38baa289a060b45d7df3e37"

RPROVIDES:${PN} += "libgslcblas-2-7-1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
gsl-2-7-1-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
lua-lmod"

inherit rpm
