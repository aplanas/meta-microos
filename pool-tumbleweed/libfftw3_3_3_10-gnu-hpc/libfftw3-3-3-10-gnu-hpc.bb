SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "f99b0343dd7d073fe1aee894d431923a91cd7969c8845e55db80cbc9b373394803fc9db9e3c6013d2d448a8be7f94c2cf1e1aca486ed1fb78919690723acb5d9"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
lua-lmod"

inherit rpm
