SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-openmpi4-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "34a179f3e051995f928cfad51638bb62a4fa8eaf4945eaaf2072441b279bc1840a5d0ee521805ac45e148b1508a474374d01ab3d863c3cb0471968afd276e1fd"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
