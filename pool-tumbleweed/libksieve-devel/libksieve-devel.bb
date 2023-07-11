SUMMARY = "Development package for libksieve"
DESCRIPTION = "This package contains development headers of libksieve."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libksieve-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "994a2b2f5937399755876310d231af42d169495ec909743b94d761848fd3f65798f7bcbdfb628114bed9b7db23716202e15cccfa07dcd1192ed62d2d0fb08fa6"

RPROVIDES:${PN} += "cmake-KF5LibKSieve \
cmake-KPim5LibKSieve \
libksieve-devel"

RDEPENDS:${PN} += "libksieve5"

inherit rpm
