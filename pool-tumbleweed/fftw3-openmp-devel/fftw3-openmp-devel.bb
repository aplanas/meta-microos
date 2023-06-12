SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-openmp-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "8da29fcbc48fabca1f131cc1aa3040a68ef613ebadbcaff6249e66215a208ed0743c194caf1d4854e58b5d91a1189f714ff3ef8a33e403f409e7827a253d7885"

RPROVIDES:${PN} += "fftw3-openmp-devel \
fftw3-openmp-devel(aarch-64)"
RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3_omp3"

inherit rpm
