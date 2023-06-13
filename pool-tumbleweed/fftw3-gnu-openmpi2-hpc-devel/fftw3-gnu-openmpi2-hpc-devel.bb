SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi2-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi2-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi2-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "1d82fdb8c482aafcf1caaa78cc86ab2c4409b20944ee5c2bdaea89aa89a70bc58b350222370004a46eb3578a56f65953e7df0e4178481efcac6fd52c5fdff090"

RPROVIDES:${PN} += "fftw3-gnu-openmpi2-hpc-devel \
fftw3-gnu-openmpi2-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "fftw3_3_3_10-gnu-openmpi2-hpc-devel"

inherit rpm
