SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi2-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "3ad3fc7ece36f9b02d0731b89291b0b33e4a4b7ac42c2da3c86b2a0d590ae858554f7d888e84f852918923da4b39460f4dddf7d2fdee86cdbfbe1fd0de084750"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
