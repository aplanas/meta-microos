SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi4-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi4-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi4-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi4-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "6c381f2151a1cbfd5ece7ac576460fce9c4593c11151f4a4b39f51cd2f0e0e93aaf20d2d4d6d3254309c671aadb798c52fabf3bb97b0ed1ddef20b38190611d4"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-openmpi4-hpc"

inherit rpm
