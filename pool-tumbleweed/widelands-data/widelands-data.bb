SUMMARY = "Data files for Widelands"
DESCRIPTION = "Data files for Widelands. Includes localization, maps graphics and music."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "widelands-data-1.1-3.2.noarch.rpm"
RPM_HASH = "f500c0ccef66f3db0f0721f52127ca831e0e4c3c7b98f520af731828224bd95a578b9c2221f9bb2712a2d8c10f79ae5344b5c9b2415d3819880d8e40981e6ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "widelands-data"
RDEPENDS:${PN} += "widelands"

inherit rpm
