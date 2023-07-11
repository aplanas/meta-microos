SUMMARY = "Busybox applets replacing vlan"
DESCRIPTION = "This package contains the symlinks to provide vlan with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vlan-1.36.1-27.1.noarch.rpm"
RPM_HASH = "2b7ea1bc83788a7a380f83f6860d2ea5520527c22d0f958301d035615e8a71038f0cd6bc048d04308136cc4381dda2fac467c2684697fcabcd1f55e15f069c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vlan"

RDEPENDS:${PN} += "busybox"

inherit rpm
