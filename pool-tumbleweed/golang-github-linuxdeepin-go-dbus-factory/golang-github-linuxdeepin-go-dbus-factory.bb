SUMMARY = "Golang DBus factory"
DESCRIPTION = "Golang DBus factory for Deepin Desktop Environment."
LICENSE = "GPL-3.0+"

PV = "1.10.20"

RPM_NAME = "golang-github-linuxdeepin-go-dbus-factory-1.10.20-1.3.noarch.rpm"
RPM_HASH = "46027900bf53c2aaad0bfe7c28049f85182eff03acad5872c9ef3dcff77e32c59e584f87393b346a26e5b2b13b1cbf17968db2c47cde3ad728dbd5733a22473d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-go-dbus-factory"
RDEPENDS:${PN} += "golang-github-linuxdeepin-go-x11-client"

inherit rpm
