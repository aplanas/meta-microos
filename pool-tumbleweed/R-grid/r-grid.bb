SUMMARY = "Package providing R-grid graphics in R-grid"
DESCRIPTION = "This package provides R-grid, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-grid-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "190df01a5c2161eed0f639e91b6292358aa5b9d8493e85c68cfc8478fead95b49c5051f269ae311e0a6f3ec31f031552f5ec02acfdc8e47e72d909527f58912b"

RPROVIDES:${PN} += "R-grid \
R-grid(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
libR.so()(64bit) \
libc.so.6()(64bit)"

inherit rpm
