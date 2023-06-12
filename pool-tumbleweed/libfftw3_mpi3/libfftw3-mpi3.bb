SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_mpi3-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "3c927567fbd21e47c8d9b372d4c3ad71975f755ea168ed4c9e5f4a4f1e9c95e6627376b6c01d1517ee72fcf3bbfeb26e246f86973a50a72de703824f74e3bedf"

RPROVIDES:${PN} += "fftw3-mpi \
libfftw3_mpi.so.3()(64bit) \
libfftw3_mpi3 \
libfftw3_mpi3(aarch-64) \
libfftw3f_mpi.so.3()(64bit) \
libfftw3l_mpi.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfftw3.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3l.so.3()(64bit)"

inherit rpm
