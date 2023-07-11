SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi3-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "4f86b43863eb6226fa158d6130b55ac5c74e822749e65e5fc5c3006c9f7dc052aabd2f08c195abb92a6a6f0c963275428ee16f0026fea09d2eaa5f40b84ad273"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libopenmpi3-gnu-hpc \
lua-lmod"

inherit rpm
