SUMMARY = "Development files for GRASS GIS 7"
DESCRIPTION = "This package contains the development files for GRASS GIS"
LICENSE = "GPL-2.0-or-later"

PV = "8.2.1"

RPM_NAME = "grass-devel-8.2.1-1.3.aarch64.rpm"
RPM_HASH = "3ba177e6f1f6259b1b2f7781fa2bd025b7f874c34bdfdf9987858a5f40c860f621f74d557c9d822bf14c4b2b61c25dfb83ff7824d5c7b2aabb2d9de38d645dec"

RPROVIDES:${PN} += "grass-devel \
grass-devel(aarch-64)"
RDEPENDS:${PN} += "grass"

inherit rpm
