SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi2-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi2-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi2-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "5d97dc1914945d5362ac5cf3ddc3525948743b7495d060c79969cd9bebfb6477e3df02384b136428c12801dc917b685bc6b4514a162970e09cd8931af5497a7b"

RPROVIDES:${PN} += "fftw3-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi2-hpc-devel"

inherit rpm
