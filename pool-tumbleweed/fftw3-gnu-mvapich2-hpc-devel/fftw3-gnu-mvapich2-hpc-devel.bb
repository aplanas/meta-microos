SUMMARY = "Dependency package for fftw3_3_3_10-gnu-mvapich2-hpc-devel"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package fftw3-gnu-mvapich2-hpc-devel provides the dependency to get binary package fftw3_3_3_10-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mvapich2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-gnu-mvapich2-hpc-devel-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "4b2d0e34c4aab97e083cd238f5168cf9e9c9ee22017ca4c2c6a9dbdf2a96df89990bfa6cda7d5a8b7f440c97015b3e6526556d5e6d993d04d83adcc3619c5097"

RPROVIDES:${PN} += "fftw3-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-mvapich2-hpc-devel"

inherit rpm
