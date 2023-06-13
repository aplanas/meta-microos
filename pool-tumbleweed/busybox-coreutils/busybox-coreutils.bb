SUMMARY = "Busybox applets replacing coreutils"
DESCRIPTION = "This package contains the symlinks to replace coreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-coreutils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "2d93c6a69378adb8b9a325ded8a111edb22e56ffefa6489e1e6dad4b6478992725d48bbd483a37cd810c6679f64767c9d64c6c372d2d9251c93255fb7c7b94b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/cat \
/bin/chgrp \
/bin/chmod \
/bin/chown \
/bin/cp \
/bin/dd \
/bin/df \
/bin/echo \
/bin/false \
/bin/ln \
/bin/ls \
/bin/mkdir \
/bin/mknod \
/bin/mktemp \
/bin/mv \
/bin/pwd \
/bin/rm \
/bin/rmdir \
/bin/sleep \
/bin/sort \
/bin/stty \
/bin/sync \
/bin/touch \
/bin/true \
/bin/uname \
busybox-coreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
