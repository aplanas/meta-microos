SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mvapich2-hpc-devel-static-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "4be7bdc32c34af4c21c42ad3d35d0389fb36312d61e9efe0f9048d2321bf77b5bc8c152990a81d3fd046917243245d3a0c60bad3f8a67d78d358a4645d59ec04"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-mvapich2-hpc-devel"

inherit rpm
