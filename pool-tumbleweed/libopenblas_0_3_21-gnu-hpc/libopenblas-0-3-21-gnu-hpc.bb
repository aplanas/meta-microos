SUMMARY = "An optimized BLAS library based on GotoBLAS2, gnu-hpc version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_0_3_21-gnu-hpc-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "ddc4b942e8d7a905acc82ad2cfe8c827296153c74f2bda80b24658de677f04fd1c3234b8682165c2ba2bf6c04ec20d0f1baef57d0e99787fb98443383f6c2fa9"

RPROVIDES:${PN} += "libopenblas_0_3_21-gnu-hpc \
libopenblas_0_3_21-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_2.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_4.5)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
lua-lmod"

inherit rpm
