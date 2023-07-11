SUMMARY = "Package providing R-splines"
DESCRIPTION = "This package provides R-splines, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-splines-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "555b7ba67e2b8daba08f635de580cf18925b3635c1026b6c7011310f61529063917a67d0d2bd8f79ca8bf1a87c7156f3b9f143c3c75f74a06525d50e2ee8a621"

RPROVIDES:${PN} += "R-splines"

RDEPENDS:${PN} += "R-base \
libR.so \
libc.so.6"

inherit rpm
