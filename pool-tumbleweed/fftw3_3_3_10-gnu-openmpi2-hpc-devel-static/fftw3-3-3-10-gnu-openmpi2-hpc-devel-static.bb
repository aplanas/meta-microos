SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi2-hpc-devel-static-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "0e03adf3ad8d7bf6c5f867d35deb8db0f526011e17d75cf1ad3b78e0160a7c3ddc7d1c2a8ba5d534857876dee8239da8c56b38a8ddcf4eb7ebe1f66439adfd3c"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi2-hpc-devel"

inherit rpm
