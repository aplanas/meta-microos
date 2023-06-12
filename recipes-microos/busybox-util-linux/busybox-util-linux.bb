SUMMARY = "Busybox applets replacing util-linux"
DESCRIPTION = "This package contains the symlinks to replace util-linux with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-util-linux-1.36.0-26.3.noarch.rpm"
RPM_HASH = "d10d43e43c9c617bb1bc355488103c115363e381d34c38b127c003c652b3368b4310f2c20298bd91ac89e40af14f30b3e14e5371193a6dad730b3448e1ce8020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/kill \
/bin/logger \
/bin/more \
/bin/mount \
/bin/su \
/bin/umount \
busybox-util-linux"
RDEPENDS:${PN} += "busybox"

inherit rpm
