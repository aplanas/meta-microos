SUMMARY = "Dependency package for fftw3_3_3_10-gnu-mpich-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-mpich-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mpich-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-mpich-hpc-devel-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "4be77c6726b98ac17a767d6e5a1fbc75ae64185c42b58ea32dc40dd208a777f30248e2a61833ce1dd548a8f19ec2d90e40b6bee9b8e8238fdefa4617a01c9cf4"

RPROVIDES:${PN} += "fftw3-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-mpich-hpc-devel"

inherit rpm
