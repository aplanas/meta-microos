SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi4-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi4-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi4-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi4-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "ff7782a20ee56cb32de7d7a5b1b6d9c5257f6ec78e1e8b59e8cae859bd25a60e0b3ed2edea817186720f910f6abdf1ca8e557332b1fe0e5772fde2dc6330e903"

RPROVIDES:${PN} += "fftw3-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi4-hpc-devel"

inherit rpm
