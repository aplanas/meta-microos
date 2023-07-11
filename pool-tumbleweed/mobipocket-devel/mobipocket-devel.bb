SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library. \
 \
This package provides development files for mobipocket \
library"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "mobipocket-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1b567676f5f40ff2d36088cb137627e8c29404c5f90d96a50e1cd153375ff403f796ec684edd780c387f660b78a95ec9601a689e9d3166fc8c2fdd9103774b5e"

RPROVIDES:${PN} += "cmake-QMobipocket \
mobipocket-devel"

RDEPENDS:${PN} += "libqmobipocket2"

inherit rpm
