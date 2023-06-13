SUMMARY = "An optimized BLAS library based on GotoBLAS2, gnu-hpc-pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads_0_3_21-gnu-hpc-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "9f5b0be4dd28ef16817eec6e0f22bc43e6cb9a96bf021508dd97c65df9169e68c81bfc957cef876e623ea80c4b4df0b9b3099d0d8ebb6d7c86a74f4646dc4af8"

RPROVIDES:${PN} += "libopenblas-pthreads_0_3_21-gnu-hpc \
libopenblas-pthreads_0_3_21-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
lua-lmod"

inherit rpm
