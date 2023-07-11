SUMMARY = "Development documentation package for the drumstick libraries"
DESCRIPTION = "This package contains the developer's documentation of the drumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-doc-2.7.2-1.4.noarch.rpm"
RPM_HASH = "bcaa16213c3b77a10d4e4dfb39f951b43d9387ca39d1f72c7bdba1dc27e779476151655d925163357beb8c487dbe4398762b901d1654259b015b0a608b4d3d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdrumstick-doc"

RDEPENDS:${PN} += ""

inherit rpm
