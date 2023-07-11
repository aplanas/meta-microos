SUMMARY = "Static libraries and headers for fastjet-contrib"
DESCRIPTION = "This package provides the static libraries for fastjet-contrib to link against."
LICENSE = "GPL-2.0-only"

PV = "1.049"

RPM_NAME = "fastjet-contrib-devel-static-1.049-1.4.aarch64.rpm"
RPM_HASH = "899272035b5b7b3342ff0621e91120879bc10f836257c15335cccfde5ede081b3d84f398beefbc099f9695facdc691fd6edc7a928673ed9d89ef878926ea716a"

RPROVIDES:${PN} += "fastjet-contrib-devel-static"

RDEPENDS:${PN} += "fastjet-contrib-devel"

inherit rpm
