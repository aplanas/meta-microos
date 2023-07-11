SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-mpich-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-mpich-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mpich-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-mpich-hpc-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "8f8b1b036e1b398cde9d3a56e29f04dc55e7aaaa59e580d15dcb2f426a512f137475816ed72d01940d486bf49e59aa53466ff0646bfb038fc3075c3dfee32e94"

RPROVIDES:${PN} += "libfftw3-gnu-mpich-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-mpich-hpc"

inherit rpm
