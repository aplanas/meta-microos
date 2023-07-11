SUMMARY = "An optimized BLAS library based on GotoBLAS2, gnu-hpc version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_0_3_21-gnu-hpc-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "e4f35db4fb99858ba41d00dac6e682eae30f49c8e12fa21ceafdc86d6df08d2a2489bb2a66016ee58f053c1254163e04a677afbfaad7bcdcb1bd544bead80620"

RPROVIDES:${PN} += "libopenblas-0-3-21-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libm.so.6 \
lua-lmod"

inherit rpm
