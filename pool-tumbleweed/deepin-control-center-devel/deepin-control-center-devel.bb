SUMMARY = "Development tools for deepin-control-center"
DESCRIPTION = "The deepin-control-center-devel package contains the header files and developer \
docs for deepin control center."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-devel-5.5.143-1.8.aarch64.rpm"
RPM_HASH = "00ed09947f379834bafa02dfb3babd37783505e4d52a56d1322f2d1567927cbdf0711e7054a2366ad958d75d0bd1b35205b12319e581dcbaddc5d71ed00ecd9d"

RPROVIDES:${PN} += "cmake-DdeControlCenter \
deepin-control-center-devel"

RDEPENDS:${PN} += "deepin-control-center"

inherit rpm
