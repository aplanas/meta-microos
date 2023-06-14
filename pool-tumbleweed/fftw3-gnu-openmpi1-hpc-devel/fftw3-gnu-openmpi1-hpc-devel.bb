SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi1-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi1-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi1-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi1-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "3b26d35b84bd0260dbb9d1f6d79d8fd64411f8d2596de0c15ef2dbcdda0d4aa7897568944670169b9cd92f079e84621e270e828eec6763d2791b3534bb468f1a"

RPROVIDES:${PN} += "fftw3-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi1-hpc-devel"

inherit rpm
