SUMMARY = "Busybox applets replacing util-linux"
DESCRIPTION = "This package contains the symlinks to replace util-linux with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-util-linux-1.36.1-27.1.noarch.rpm"
RPM_HASH = "886204d3d1e232ed7cc3207fa0ed7a413f302ee3200359228f2a6b12ebf6e1b7c489190478cf7ce55d20cfc2a228a4b3c494aefa79061c47cb32513b1ac46097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/kill \
/usr/bin/logger \
/usr/bin/more \
/usr/bin/mount \
/usr/bin/su \
/usr/bin/umount \
busybox-util-linux"

RDEPENDS:${PN} += "busybox"

inherit rpm
