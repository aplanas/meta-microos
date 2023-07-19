SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-MicroOS-17.89-1.46.aarch64.rpm"
RPM_HASH = "316139bff87dcfbf01a0f920a202df6e05c32d9e310f84032853b9a9ddfd0a0c4b5427f7fff965ce0342699fc175c768e5c750c404522284e0343668c33a5eae"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
