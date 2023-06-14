SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi2-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi2-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi2-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "1e3afb74197b1b2ce2b977ef5147e3538fee133f20540c0b8f3435d55f78436f5bb3fc794d0588a51ea868ebd869cc4d19ea5e0b93dec8219cde049f04424d7a"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-openmpi2-hpc"

inherit rpm
