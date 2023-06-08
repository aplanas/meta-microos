SUMMARY = "Dependency package for fftw3_3_3_10-gnu-mpich-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-mpich-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mpich-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-mpich-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "ebdcf7f0d8649b7d2d9c83e22134aac36fdade4d473a892edab486a2c129660bc679777c5292fccf8ab19d92c55d854089ac3d264f89c883b288c8cf6c0781a3"

RPROVIDES:${PN} += "fftw3-gnu-mpich-hpc-devel fftw3-gnu-mpich-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "fftw3_3_3_10-gnu-mpich-hpc-devel"

inherit rpm
