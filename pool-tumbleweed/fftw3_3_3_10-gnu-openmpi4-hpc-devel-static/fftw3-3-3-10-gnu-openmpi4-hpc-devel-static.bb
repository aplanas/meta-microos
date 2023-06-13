SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi4-hpc-devel-static-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "ac6b1232046c387deb526e0291852e271f92adff8853b22700fbc888af54d5f8ceb37bad4d6e1f3fd7a2e1276598d1799acddf8b68a13d20b7004ff53527036f"

RPROVIDES:${PN} += "fftw3_3_3_10-gnu-openmpi4-hpc-devel-static \
fftw3_3_3_10-gnu-openmpi4-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "fftw3_3_3_10-gnu-openmpi4-hpc-devel"

inherit rpm
