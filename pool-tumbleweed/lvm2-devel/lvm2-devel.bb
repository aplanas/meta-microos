SUMMARY = "Development files for LVM2"
DESCRIPTION = "This package provides development files for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-devel-2.03.16-8.1.aarch64.rpm"
RPM_HASH = "ce937f03a9b951b59771d56a292b9b27f70e65388985635991a7de19d6e150b6eb21fbfb461123012f77f993ba40b767212180f9bdff0faf33bb8c52c7a453b9"

RPROVIDES:${PN} += "lvm2-devel"

RDEPENDS:${PN} += "device-mapper-devel \
liblvm2cmd2-03 \
lvm2"

inherit rpm
