SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi2-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "b65f1488a203874f054896785495f6be59d476f9bf52ce310d7bb8b615c754800aebeace9a829cc7bcfb6a1d23af19c473f9078d232fd54eed3505988062bc81"

RPROVIDES:${PN} += "fftw3 \
libfftw3_3_3_10-gnu-openmpi2-hpc \
libfftw3_3_3_10-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
