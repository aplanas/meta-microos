SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi2-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi2-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi2-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "e0d737d8c1bddd7a66b3f00da7432243dc6784110bfbdd6d448bc031400ad986636f4112a90af04cc9ee56c7e6247b343def43f658d1f482bf25d80afdb7cee6"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-openmpi2-hpc"

inherit rpm
