SUMMARY = "An optimized BLAS library based on GotoBLAS2, gnu-hpc version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_0_3_21-gnu-hpc-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "ddc4b942e8d7a905acc82ad2cfe8c827296153c74f2bda80b24658de677f04fd1c3234b8682165c2ba2bf6c04ec20d0f1baef57d0e99787fb98443383f6c2fa9"

RPROVIDES:${PN} += "libopenblas-0-3-21-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libm.so.6 \
lua-lmod"

inherit rpm
