SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi1-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi1-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi1-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi1-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "6f30ddf129c307f985de7c499e8649737ca20566a4c071f1c703caede70d4d834c0d01139512e678f70da95d5af6cb1a08c6f32bfc13e8d75b86893daf45d1d9"

RPROVIDES:${PN} += "fftw3-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi1-hpc-devel"

inherit rpm
