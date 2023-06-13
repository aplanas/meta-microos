SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-mpi-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "a1bdbc0dfaeba307bceb1a4dd54ab96d662a98c6f720035e0d8d870e61febd3468fa3efbb69ac0caf264d4205f3988bf5f81630184cbc2720d6d5026c58a026f"

RPROVIDES:${PN} += "fftw3-mpi-devel \
fftw3-mpi-devel(aarch-64)"

RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3_mpi3 \
openmpi-devel"

inherit rpm
