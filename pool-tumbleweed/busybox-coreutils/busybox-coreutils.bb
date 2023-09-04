SUMMARY = "Busybox applets replacing coreutils"
DESCRIPTION = "This package contains the symlinks to replace coreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-coreutils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "6ab54fabb3df75b69301ece50dffea059b89eda5a6e1a6f2afe8ff9c34526e7c73f5141398ebff05575209af28806b752607a3b43fc813185d9e560f4d4c2548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/cat \
/usr/bin/chgrp \
/usr/bin/chmod \
/usr/bin/chown \
/usr/bin/cp \
/usr/bin/dd \
/usr/bin/df \
/usr/bin/echo \
/usr/bin/false \
/usr/bin/ln \
/usr/bin/ls \
/usr/bin/mkdir \
/usr/bin/mknod \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/pwd \
/usr/bin/rm \
/usr/bin/rmdir \
/usr/bin/sleep \
/usr/bin/sort \
/usr/bin/stty \
/usr/bin/sync \
/usr/bin/touch \
/usr/bin/true \
/usr/bin/uname \
busybox-coreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
