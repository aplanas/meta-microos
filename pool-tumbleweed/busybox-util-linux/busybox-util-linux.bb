SUMMARY = "Busybox applets replacing util-linux"
DESCRIPTION = "This package contains the symlinks to replace util-linux with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-util-linux-1.36.1-30.1.noarch.rpm"
RPM_HASH = "79c0de0f3513df5c5521713cd01e67f8f1176a149526c4c1ade74db1967a132ae6734a28d001e9934ffd8f67be156ea41d4197e23578721773ddf03dc58f27ef"
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
