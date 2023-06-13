SUMMARY = "Package providing R-tools"
DESCRIPTION = "This package provides R-tools, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-tools-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "7bbe3db66823392b9b0e390fdcdb167592e2c8a3e68e4a72887801d5865192360a9c8ad4bbf28485f721d8421a3f4b0e1a6029145d6ddef10f2a80c2cee68fe0"

RPROVIDES:${PN} += "R-tools \
R-tools(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
