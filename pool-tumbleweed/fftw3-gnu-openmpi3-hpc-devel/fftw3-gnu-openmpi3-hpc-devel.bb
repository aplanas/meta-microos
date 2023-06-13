SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi3-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi3-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi3-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi3-hpc-devel-3.3.10-3.4.aarch64.rpm"
RPM_HASH = "1e28ad08785ae0b98185c38c75d9546ebf00117f785f58ad348be26c16614605cf0750fa0c458587d9e27277166dfb50c1171e0f648ebc45aa1ed5fdfb7e475a"

RPROVIDES:${PN} += "fftw3-gnu-openmpi3-hpc-devel \
fftw3-gnu-openmpi3-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "fftw3_3_3_10-gnu-openmpi3-hpc-devel"

inherit rpm
