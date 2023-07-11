SUMMARY = "Development files for GRASS GIS 7"
DESCRIPTION = "This package contains the development files for GRASS GIS"
LICENSE = "GPL-2.0-or-later"

PV = "8.2.1"

RPM_NAME = "grass-devel-8.2.1-1.4.aarch64.rpm"
RPM_HASH = "971cf833be80bb20d0dd7dca18904d546e7012c78dcf5122ff95b4e71f3a8319979e744c953159a471a9f437529c362f179348a3356cf3b01ee0afac02c539b3"

RPROVIDES:${PN} += "grass-devel"

RDEPENDS:${PN} += "grass"

inherit rpm
