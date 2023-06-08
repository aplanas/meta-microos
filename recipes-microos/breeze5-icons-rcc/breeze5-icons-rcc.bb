SUMMARY = "Breeze icon theme - rcc file"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme. \
This contains the Breeze (non-dark) icons in a QResource file, used by Kexi."
LICENSE = "LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "breeze5-icons-rcc-5.105.0-1.1.noarch.rpm"
RPM_HASH = "b729ad06b306f524d05b1f3a32530596834abf679c1628f3d7fe5f86435eb0bfc8eda02979e706b2bd641e8926a4c7fbcd67f258cc8f789a80dee8cf2443ab68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-icons-rcc"
RDEPENDS:${PN} += ""

inherit rpm
