SUMMARY = "Busybox applets replacing traceroute"
DESCRIPTION = "This package contains the symlinks to replace traceroute with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-traceroute-1.36.1-30.1.noarch.rpm"
RPM_HASH = "1fe83dec603a878b3d8ff9b84b0574b28966745bfc082a691ca4ba8f2a64e2b44548854f7d166ee1ad53c3aada06a701b59b1534bb82c516a89f578a4975a359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-traceroute"

RDEPENDS:${PN} += "busybox"

inherit rpm
