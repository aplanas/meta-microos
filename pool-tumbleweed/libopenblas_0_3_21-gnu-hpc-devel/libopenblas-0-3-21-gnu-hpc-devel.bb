SUMMARY = "Development libraries for OpenBLAS, gnu-hpc version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_0_3_21-gnu-hpc-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "86202f1a4f8a3a89826d7745c6f65812a93d21fc2a2658cb61a88491539f0aa937cb02608dac7aac65571e13e0eca6faaff3d2b03aad070773e30a73748f56c8"

RPROVIDES:${PN} += "libopenblas_0_3_21-gnu-hpc-devel \
libopenblas_0_3_21-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libopenblas_0_3_21-gnu-hpc"

inherit rpm
