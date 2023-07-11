SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-mpi-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "4278ba6b84c13b4d65d1e5e8b74482b7132e9cd79ad0ed96bf3425867b69208765a45f2fbd83e03270ebf4c7d0dd94f23ccd8624f006342f2066c4f41625b9de"

RPROVIDES:${PN} += "fftw3-mpi-devel"

RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3-mpi3 \
openmpi-devel"

inherit rpm
