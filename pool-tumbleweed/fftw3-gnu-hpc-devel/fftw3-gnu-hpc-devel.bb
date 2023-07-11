SUMMARY = "Dependency package for fftw3_3_3_10-gnu-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-hpc-devel-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "6cdc8300468341a38208b4e8eaea5e0396685b6dc4d83e181b2531fd963855f8ea54785d539f583acc09880c8e54f65a9f9f0408058dfb78fdf92f882617ab91"

RPROVIDES:${PN} += "fftw3-gnu-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-hpc-devel"

inherit rpm
