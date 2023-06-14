SUMMARY = "Additional plasmoid widgets - development files"
DESCRIPTION = "This package contains development files to develop additional widgets for \
the Plasma desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-addons-devel-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "1c0bcdaf695517ec45cfab62356a6b26e42a4283779b83520611d39844fdcb0a9b259499b3787026cabbf293099fbf3d1e6a542e724c87c80ca34e277df5d9ae"

RPROVIDES:${PN} += "cmake-PlasmaPotdProvider \
plasma5-addons-devel"

RDEPENDS:${PN} += "plasma5-addons"

inherit rpm
