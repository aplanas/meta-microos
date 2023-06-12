SUMMARY = "Dependency package for fftw3_3_3_10-gnu-mvapich2-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-mvapich2-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mvapich2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-mvapich2-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "21d85eb1fe57e1650a00b12ff4da63d50a7aa721d642a494ef0cdb3691f1f62f96730fe5fc4b31caf6af1ff2823acf09cf1808508c925f413b635ff2e1b61967"

RPROVIDES:${PN} += "fftw3-gnu-mvapich2-hpc-devel \
fftw3-gnu-mvapich2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "fftw3_3_3_10-gnu-mvapich2-hpc-devel"

inherit rpm
