SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-mvapich2-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "d42ce00c5e2b8a4cccf95bd8a33a8164b6d653a3234b20918a981b9305b07d7abb9b01caeb64641bbca5d8264bd0e7120d17cc1ab90230cd7a91832ed0ebc022"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
