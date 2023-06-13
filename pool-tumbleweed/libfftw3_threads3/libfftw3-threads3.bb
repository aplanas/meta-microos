SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_threads3-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "9fb080bc8227dc7de37423b45ed5fd839dc9a92a25abfcf6e1c564307643d0485d85ea5cbeddddc27cdd470014ffbc7830f85556c1af1a296a2bce48f95c23c4"

RPROVIDES:${PN} += "fftw3-threads \
libfftw3_threads.so.3()(64bit) \
libfftw3_threads3 \
libfftw3_threads3(aarch-64) \
libfftw3f_threads.so.3()(64bit) \
libfftw3l_threads.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3l.so.3()(64bit)"

inherit rpm
