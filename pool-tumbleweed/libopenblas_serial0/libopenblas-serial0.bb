SUMMARY = "An optimized BLAS library based on GotoBLAS2, serial version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_serial0-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "9b82849c363fa64edd0f5f6037a3a1d2faa737696f8fd392ee8e4508230a8beab0d06aae804defc0698a13520aba9d13229717f21a89061edfc4e1dc99c3f6a1"

RPROVIDES:${PN} += "libopenblas.so.0()(64bit) \
libopenblas0 \
libopenblas_serial0 \
libopenblas_serial0(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
update-alternatives"

inherit rpm
