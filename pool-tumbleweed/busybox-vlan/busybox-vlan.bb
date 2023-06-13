SUMMARY = "Busybox applets replacing vlan"
DESCRIPTION = "This package contains the symlinks to provide vlan with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-vlan-1.36.0-26.3.noarch.rpm"
RPM_HASH = "afeaf682291d22757c6e6723e04cf87f8fda03ca13bde220656d7c74ec1a369909e5d465506ddaa614497a0dd9d149e907013becad76c42fea2bf5459402883d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vlan"

RDEPENDS:${PN} += "busybox"

inherit rpm
