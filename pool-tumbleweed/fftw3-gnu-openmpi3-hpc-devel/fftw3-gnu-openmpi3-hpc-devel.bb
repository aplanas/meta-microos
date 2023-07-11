SUMMARY = "Dependency package for fftw3_3_3_10-gnu-openmpi3-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-openmpi3-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi3-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-openmpi3-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "bca03426a8c8c6d15a0d9a7e4b7741c6eb8e933379505fdb4ed7df7f197aeb4fae069bb5d626324bc51608110d97d009a2c739e7ab6367de6156ffafdd970aaa"

RPROVIDES:${PN} += "fftw3-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi3-hpc-devel"

inherit rpm
