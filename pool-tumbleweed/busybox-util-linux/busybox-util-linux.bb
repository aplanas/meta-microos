SUMMARY = "Busybox applets replacing util-linux"
DESCRIPTION = "This package contains the symlinks to replace util-linux with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-util-linux-1.36.1-28.1.noarch.rpm"
RPM_HASH = "a4867f2e64eddb3ced67c8c7eccc5ec3d974ce4bf747a855c080f8c1f0e2857e59ca35a47c6975040a89ce01277029f515f1a5553186aec21c94d34cc54f6052"
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
