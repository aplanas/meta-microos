SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi1-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi1-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi1-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi1-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "0a62d48acb5db23c1a27e85b63507a744b323266e8bc4febb663b257c08c67955eb958a419884b8bc0ed07f98e5cec1c985afde753347a4f67adbd9ba9b5c137"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-openmpi1-hpc"

inherit rpm
