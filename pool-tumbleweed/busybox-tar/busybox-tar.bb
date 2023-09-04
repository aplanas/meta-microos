SUMMARY = "Busybox applets replacing tar"
DESCRIPTION = "This package contains the symlinks to replace tar with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tar-1.36.1-28.1.noarch.rpm"
RPM_HASH = "52a086a6b44af3964aeba3586c1759c425c05d61968ee2a6523560181e90a9955b226932625fabe1a718d555ea73d6dae60c9076fbe5bed5d1e21825417b6eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/tar \
busybox-tar"

RDEPENDS:${PN} += "busybox"

inherit rpm
