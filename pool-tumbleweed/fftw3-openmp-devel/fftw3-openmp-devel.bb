SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-openmp-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "2b8267a6cda647f78d8708fc9d63575202261d1cb60d0838c440d22a6157443cd0ac18acfc170aa2a56b740439b8ac884b63f23a5afa7bb63eb300aff5b4505d"

RPROVIDES:${PN} += "fftw3-openmp-devel"

RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3-omp3"

inherit rpm
