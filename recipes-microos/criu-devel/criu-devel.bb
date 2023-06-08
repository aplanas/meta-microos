SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications with CRIU library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.17.1"

RPM_NAME = "criu-devel-3.17.1-3.5.aarch64.rpm"
RPM_HASH = "88f88c24c79309a2c147d734f321e6663d7a497d6824618b854079815520beda2d0dfda9a4e77115365f0998c01d178817845d0f17b9e0b2db79b2efe07707d6"

RPROVIDES:${PN} += "criu-devel criu-devel(aarch-64) pkgconfig(criu)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libcompel1 libcriu2"

inherit rpm
