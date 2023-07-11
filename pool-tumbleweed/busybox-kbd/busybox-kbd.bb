SUMMARY = "Busybox applets replacing kbd"
DESCRIPTION = "This package contains the symlinks to replace kbd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kbd-1.36.1-27.1.noarch.rpm"
RPM_HASH = "738ad174d1431eaa811a56edbe886661a14111fa7a1eef91554c533b52810e1d2f3c52b7945a8c6b825b9a211265a17445e6c596d3e84a059208eb0e05c745e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-kbd"

RDEPENDS:${PN} += "busybox"

inherit rpm
