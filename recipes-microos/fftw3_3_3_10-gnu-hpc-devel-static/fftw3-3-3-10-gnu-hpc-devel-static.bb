SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-hpc-devel-static-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "3f3e6f793ea2480e4dd20894c58d3d845bbd5ed27a83f93f25d7abfd95cd469b034fa28ad1d9f6e86687caeecac026511ecc13dcc05342f4516130e8555a403f"

RPROVIDES:${PN} += "fftw3_3_3_10-gnu-hpc-devel-static fftw3_3_3_10-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "fftw3_3_3_10-gnu-hpc-devel"

inherit rpm
