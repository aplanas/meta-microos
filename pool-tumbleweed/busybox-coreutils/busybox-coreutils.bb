SUMMARY = "Busybox applets replacing coreutils"
DESCRIPTION = "This package contains the symlinks to replace coreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-coreutils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "dbddae50da4eb1bd2661989cd0388fabfd61c7014b514245df5ff44a245d825372c93c96cc915b165800ad106fe1dbdc411ba2596410a741f3cb095cbc12fea2"
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
