SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "dolphin-devel-23.04.0-2.1.aarch64.rpm"
RPM_HASH = "b4a04b292e308b87783e4812f9a7822b4216843f0ccefe11f8fc77c1fb4155ec16c94e2fc2eea3c54fb5f72d50d8fee145511477fb5d927ef5eb7026897d2080"

RPROVIDES:${PN} += "cmake(DolphinVcs) dolphin-devel dolphin-devel(aarch-64) dolphin5-devel"
RDEPENDS:${PN} += "libdolphinvcs5"

inherit rpm
