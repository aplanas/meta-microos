SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi1-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "43ba5a01d789bd2634854fdac0c5523bedd98d62309e5b1f936be956f413ce3c13b6906900c755749337069b93fd24d6e808add430d00aa294d5594f59fa68fe"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libopenmpi1-gnu-hpc \
lua-lmod"

inherit rpm
