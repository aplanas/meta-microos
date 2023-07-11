SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-mvapich2-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-mvapich2-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mvapich2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-mvapich2-hpc-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "9f975ec840ce2e4de64756dc78220585207aea25ba761ad30be5712b21e14a56446360de7165498227a5847cf5f29d868b872b9e6ee5fa0f6314eab238224c38"

RPROVIDES:${PN} += "libfftw3-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libfftw3-3-3-10-gnu-mvapich2-hpc"

inherit rpm
