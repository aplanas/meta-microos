SUMMARY = "Deepin Network Utils"
DESCRIPTION = "Deepin Network Utils is an application repackage the DBus data which is provided \
by network module of dde-daemon"
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "deepin-network-utils-5.4.13-1.7.aarch64.rpm"
RPM_HASH = "c1a7e5a5e20d66492bbaa939ec5bb1b8d82174b9e14d4b67503e4b435939e1be9af72b7071f6307c840d7937992fd8cdfd68176e6d6fc502b56dea17abf8c801"

RPROVIDES:${PN} += "deepin-network-utils"

RDEPENDS:${PN} += ""

inherit rpm
