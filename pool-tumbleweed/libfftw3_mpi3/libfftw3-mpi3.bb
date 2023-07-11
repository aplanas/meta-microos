SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_mpi3-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "ec9f5e36a39db65e299a0b6be026f36ec059113fdd5eab8b4e30929f54a5b27a5f60827b502eb5acb60a2f2077db3ebf71a9276a163fb5420f8c4a568f954a6c"

RPROVIDES:${PN} += "fftw3-mpi \
libfftw3-mpi.so.3 \
libfftw3-mpi3 \
libfftw3f-mpi.so.3 \
libfftw3l-mpi.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfftw3l.so.3"

inherit rpm
