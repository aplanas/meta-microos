SUMMARY = "Breeze icon theme"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "breeze5-icons-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8df1cc66efe9c591fb35350d34b8ade7f315217dec76bc3ea4c827a74cbd5635107737948634a3888c3d581532ceec28ebfb88547a2e57ceb1a2ba17fd4e44bf"

RPROVIDES:${PN} += "breeze5-icons \
cmake-KF5BreezeIcons"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
