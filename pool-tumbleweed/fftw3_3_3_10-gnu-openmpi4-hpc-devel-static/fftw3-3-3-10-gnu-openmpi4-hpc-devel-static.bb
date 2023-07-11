SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi4-hpc-devel-static-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "d6243b515e1b6235ca6d922fe3a3475f2eb32a0db948f42f2f0c094de6a64d340e8ec42247e7a222c220be8c6b3506cf565d590e4aa89e8cfacdcc89bd9d30f8"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi4-hpc-devel"

inherit rpm
