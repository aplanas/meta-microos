SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-hpc-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "aa2f8eb1b994e26bbe9fe2c0ed8279b3525e75f06a2020bf4f5231a156ed9ca6c3f26ee13264164bb319e052717326dc1ed2fb5c94747b418c01d2e78511548f"

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
