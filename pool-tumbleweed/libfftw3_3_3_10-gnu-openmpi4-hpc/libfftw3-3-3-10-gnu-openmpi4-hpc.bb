SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi4-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "6c03a544a9f184bdd943ee1f9c12edb9a281c7d0c5f9ee526e0868320ab04a0ee2032445ef3305bfd087a1efea425f90b026c525207b8737860c57e817e69339"

RPROVIDES:${PN} += "fftw3 \
libfftw3_3_3_10-gnu-openmpi4-hpc \
libfftw3_3_3_10-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
