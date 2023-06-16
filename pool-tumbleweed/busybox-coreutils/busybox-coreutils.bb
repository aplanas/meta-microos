SUMMARY = "Busybox applets replacing coreutils"
DESCRIPTION = "This package contains the symlinks to replace coreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-coreutils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "2d93c6a69378adb8b9a325ded8a111edb22e56ffefa6489e1e6dad4b6478992725d48bbd483a37cd810c6679f64767c9d64c6c372d2d9251c93255fb7c7b94b1"
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
