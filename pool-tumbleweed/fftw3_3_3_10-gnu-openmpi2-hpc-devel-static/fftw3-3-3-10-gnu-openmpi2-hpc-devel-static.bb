SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi2-hpc-devel-static-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "f7a51ce0ab19debbc843574e8f58f22ac54adc71bd84b8bd793c04ff3c88ed74c7ee2ce354bcfa2ec474687a337a3a5a2857113c8110f4fa7d7d97836c34c9cb"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi2-hpc-devel"

inherit rpm
