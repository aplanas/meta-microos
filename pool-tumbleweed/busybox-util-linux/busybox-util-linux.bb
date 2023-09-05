SUMMARY = "Busybox applets replacing util-linux"
DESCRIPTION = "This package contains the symlinks to replace util-linux with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-util-linux-1.36.1-29.1.noarch.rpm"
RPM_HASH = "e195f19ce67deb9cc3eee35f5eec62bc9f174226a43981b1b97ceb50cae700c82128c9f7b11139b9a07e89a5eeef8387d6e576187b830467a3fa5aa8e9a1fa7d"
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
