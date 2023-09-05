SUMMARY = "Busybox applets replacing coreutils"
DESCRIPTION = "This package contains the symlinks to replace coreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-coreutils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "7e1fcb32d6fcab0ab39596c2513fdca3fe2918c413f101a78ae5eb082067fb67634562bf3d57f381f9fda75d6293a9383a6daa9ea45f15240318923431e1604e"
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
