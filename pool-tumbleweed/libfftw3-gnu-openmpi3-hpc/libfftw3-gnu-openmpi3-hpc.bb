SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi3-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi3-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi3-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi3-hpc-3.3.10-3.4.aarch64.rpm"
RPM_HASH = "ffbabef72eecc490efa00429a02df99a811647a7f6a85a3d161b0c4e8a61cc4b3285b0e6ecb2e8718b08191ec41266017bc883191157cd61049ab7a503b73a99"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi3-hpc \
libfftw3-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "libfftw3_3_3_10-gnu-openmpi3-hpc"

inherit rpm
