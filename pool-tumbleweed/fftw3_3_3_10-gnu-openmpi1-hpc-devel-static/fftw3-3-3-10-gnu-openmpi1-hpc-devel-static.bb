SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi1-hpc-devel-static-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "5a1df8cffd16d197c640eaf4a792c91ca874bf47ca15bd1c661dfba803bf240307ce929da6099846f74f453058bf618ebadc0781c3ada93525a99c4372dbab29"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi1-hpc-devel"

inherit rpm
