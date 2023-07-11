SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-hpc-devel-static-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "1f7cf382a6e6d3711935596b434b547f8164d0cce62e9f1171a1995943df448fa0167edd3d3b92ce998c9dfc127e846468508d3c1e7540098901fd455aeba0f1"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-hpc-devel"

inherit rpm
