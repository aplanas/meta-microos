SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_omp3-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "75ce1c8a538efee66521ac701e682cce57ebba5939dbed21f40b11888768e52b8f64a6d3044a17885d4ca5898a1aadaef17573ad8fb8ad62fef6c1eae84d649a"

RPROVIDES:${PN} += "fftw3-openmp \
libfftw3-omp.so.3 \
libfftw3-omp3 \
libfftw3f-omp.so.3 \
libfftw3l-omp.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfftw3l.so.3 \
libgomp.so.1"

inherit rpm
