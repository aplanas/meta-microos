SUMMARY = "An optimized BLAS library based on GotoBLAS2, gnu-hpc-pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads_0_3_21-gnu-hpc-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "45785ef2b6d808d551599d6e286175a8318a1347fc10d6a2e4b80578788b6bc8e3f566751ebb9c4163f7f7ccfe17f2c0d13299fb93bd80b50ada92cfa3574d5d"

RPROVIDES:${PN} += "libopenblas-pthreads-0-3-21-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
lua-lmod"

inherit rpm
