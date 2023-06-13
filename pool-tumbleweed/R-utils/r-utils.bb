SUMMARY = "Package providing R-utils"
DESCRIPTION = "This package provides R-utils, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-utils-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "cab55c0730fbf74123e3365fbe19df88924c8471ee996fcdaf744dfcc7b9e941c2e32e97d1b4a6cab32c518062a93167790f059a8153ed2b61e84f2645ce337c"

RPROVIDES:${PN} += "R-utils \
R-utils(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
