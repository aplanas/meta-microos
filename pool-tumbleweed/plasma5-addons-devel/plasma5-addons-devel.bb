SUMMARY = "Additional plasmoid widgets - development files"
DESCRIPTION = "This package contains development files to develop additional widgets for \
the Plasma desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "plasma5-addons-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "685c64016bd575335e9fd326ad5845070a735be26dd055dae9526b6ab7d08e1fbd1a731a3a40b40d9f256b188791898e5cb387f3d991ab9e1a821399447c3ce3"

RPROVIDES:${PN} += "cmake-PlasmaPotdProvider \
plasma5-addons-devel"

RDEPENDS:${PN} += "plasma5-addons"

inherit rpm
