SUMMARY = "Deepin Network Utils"
DESCRIPTION = "Deepin Network Utils is an application repackage the DBus data which is provided \
by network module of dde-daemon"
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "deepin-network-utils-5.4.13-1.8.aarch64.rpm"
RPM_HASH = "775888a8ee24bdcf3c97c3e162dfe77e6d419cea2d936c24c31485de9a7a00680e2078e2c4977b9dc76255e1928fcfe1bca9eb68e033612d4033c35e9c7f92c6"

RPROVIDES:${PN} += "deepin-network-utils"

RDEPENDS:${PN} += ""

inherit rpm
