SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-mpich-hpc-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "441a228d2eccc813ed6daab1aa44986c94ddd9645b48f222df68ce8a3326f38591a06841ca4bd9b15889dee627c5e68f0ae201d9913f9202857288d955b67f5e"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-mpich-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
