SUMMARY = "Busybox applets replacing tar"
DESCRIPTION = "This package contains the symlinks to replace tar with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tar-1.36.1-30.1.noarch.rpm"
RPM_HASH = "d823d16e322897eba47ab3553d05aeaba05da4e4dd63ec195bccc31f5a58939ea1e8703934949cc8d5cb2c7cc6872a0ee74956a42601524e5e76d239f77a419c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/tar \
busybox-tar"

RDEPENDS:${PN} += "busybox"

inherit rpm
