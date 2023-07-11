SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi3-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi3-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi3-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi3-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "f8c9fd7db95af13fc67a0cecf4a1974a8c25cb830aa2ce306ddbe424df927101364f7ed36f6695806700d7da6b1c73128eb4fb2e334bbdbd399370217593eccb"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-openmpi3-hpc"

inherit rpm
