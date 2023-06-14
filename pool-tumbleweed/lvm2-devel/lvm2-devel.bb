SUMMARY = "Development files for LVM2"
DESCRIPTION = "This package provides development files for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-devel-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "0f4d2e7666ff0371f5f2d990c6781bfdc8169134e53d57726a2ac11eeb9612f195166d6a6d0d6712faf1dbb1320ec27e9621bdff432bd2cfad649c949e7abef3"

RPROVIDES:${PN} += "lvm2-devel"

RDEPENDS:${PN} += "device-mapper-devel \
liblvm2cmd2-03 \
lvm2"

inherit rpm
