SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi3-hpc-devel-static-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "c8fd09d1cdd330cbdf234f6627b5c9fba037974e7c153b5e92001576c692f4d70a0ad34512baf0e52903ef79034b638c8f3e007eed18b0e0ced5364b1e90deb7"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi3-hpc-devel"

inherit rpm
