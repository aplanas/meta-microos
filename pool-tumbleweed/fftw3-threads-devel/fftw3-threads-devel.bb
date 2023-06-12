SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-threads-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "d3a8f8b624cb9ad8af08e45d7a547cbe48ac2144051393b98558e4386b0149e7ab94ca6419de05aa76ccdb585ec2e40386d00917ca9c3096f9b10d0ddea4fd8f"

RPROVIDES:${PN} += "fftw3-threads-devel \
fftw3-threads-devel(aarch-64)"
RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3_threads3"

inherit rpm
