SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi4-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi4-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi4-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi4-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "571c54a33dc9a720cb592b5a0b676fd3a6aba7785d586eaf5d8bd95b7d8c34ddce714fc439d44e2f40eee39b8419dfc0ae2f8b52e971595153f18fa4c462fa6a"

RPROVIDES:${PN} += "fftw3-gnu-openmpi4-hpc-devel \
fftw3-gnu-openmpi4-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "fftw3_3_3_10-gnu-openmpi4-hpc-devel"

inherit rpm
