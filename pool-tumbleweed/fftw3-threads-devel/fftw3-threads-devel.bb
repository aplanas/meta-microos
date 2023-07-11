SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-threads-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "b672328dd7edbd6770306775067df734289ceaf0ac237bcb95a63104f90b456e750dd6d4b2d04dd35caf02927a247e1e337f911ad34926a0252d6715baf197ab"

RPROVIDES:${PN} += "fftw3-threads-devel"

RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3-threads3"

inherit rpm
