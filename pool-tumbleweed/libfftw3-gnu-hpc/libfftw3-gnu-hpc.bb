SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-hpc-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "70eeb67ccb2af059d6dd90f39e24356bd3516831131cccc5273223b925205d454f4002f88461c0f04bfadc760ecb6fe24d18f9227570cd14c39442ce27ddb15f"

RPROVIDES:${PN} += "libfftw3-gnu-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-hpc"

inherit rpm
