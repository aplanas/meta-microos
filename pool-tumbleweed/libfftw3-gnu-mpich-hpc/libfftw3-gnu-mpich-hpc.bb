SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-mpich-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-mpich-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mpich-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-mpich-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "a95be448e73dcd908d1acd2b072e21c4f72017e8fe7cd4b0e38c4fd83f4bf51207599bd1d2e172555c5345c4bbab73a7a8a04767e643166280bbf1d4b2e1d02a"

RPROVIDES:${PN} += "libfftw3-gnu-mpich-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-mpich-hpc"

inherit rpm
