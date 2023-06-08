SUMMARY = "Dependency package for fftw3_3_3_10-gnu-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "a695c35597a924c417e4ca87c32085644cf144981ae2cbc3e45560b39bdb681ea55b8006e1bfc9efd851fdd81e99ca14462bb2a870413e3dfaae8678b0e40eb7"

RPROVIDES:${PN} += "fftw3-gnu-hpc-devel fftw3-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "fftw3_3_3_10-gnu-hpc-devel"

inherit rpm
