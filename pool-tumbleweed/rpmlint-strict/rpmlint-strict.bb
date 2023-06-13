SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230602.89901a92"

RPM_NAME = "rpmlint-strict-2.4.0+git20230602.89901a92-1.1.noarch.rpm"
RPM_HASH = "89bd285e25d51e1c15e2d7a8e1969510574941146af5b459f80ccdcc4a8bc7c75d010509c8cda342474d65152e5fdfd1ed2aefade80623e4c141a29af7d22b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rpmlint-strict) \
rpmlint-strict"

RDEPENDS:${PN} += ""

inherit rpm
