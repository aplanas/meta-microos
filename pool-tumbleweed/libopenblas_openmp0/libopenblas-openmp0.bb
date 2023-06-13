SUMMARY = "An optimized BLAS library based on GotoBLAS2, openmp version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_openmp0-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "9f2fb535d001ec15391d53bf386932ca0a300662c01fe8829e07d10bff71955d429531a67da076399162c08ebf6444e5b64ecf8b55cc10a7522133aea88f2f52"

RPROVIDES:${PN} += "libopenblas.so.0()(64bit) \
libopenblas_openmp0 \
libopenblas_openmp0(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
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
update-alternatives"

inherit rpm
