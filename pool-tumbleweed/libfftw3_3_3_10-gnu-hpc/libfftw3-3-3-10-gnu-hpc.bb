SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "f99b0343dd7d073fe1aee894d431923a91cd7969c8845e55db80cbc9b373394803fc9db9e3c6013d2d448a8be7f94c2cf1e1aca486ed1fb78919690723acb5d9"

RPROVIDES:${PN} += "fftw3 \
libfftw3_3_3_10-gnu-hpc \
libfftw3_3_3_10-gnu-hpc(aarch-64)"

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
lua-lmod"

inherit rpm
