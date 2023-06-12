SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi1-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi1-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi1-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi1-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "111f2b96f9654f360bdad1cb8028365167de9c916aa56f15063549aca3654fb3c2d39a2a097d720d2a42d0fc8c7571a2899f88bb55e151911429fb1133477e81"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi1-hpc \
libfftw3-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "libfftw3_3_3_10-gnu-openmpi1-hpc"

inherit rpm
