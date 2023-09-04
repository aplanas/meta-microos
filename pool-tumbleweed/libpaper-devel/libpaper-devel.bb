SUMMARY = "This package contains the development files needed by libpaper"
DESCRIPTION = "This package contains all devel files needed by the libpaper package"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libpaper-devel-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "cec503f5724207eed3e3104e3944bec75ce46199b67cd4c6b67b95a5d0edcf9a8d3583f59b6efabb0952d416268c140b5afe4776b673ddb6b4ec76ec97dbc8bb"

RPROVIDES:${PN} += "libpaper-devel"

RDEPENDS:${PN} += "libpaper2"

inherit rpm
