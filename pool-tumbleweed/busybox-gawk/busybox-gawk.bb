SUMMARY = "Busybox applets replacing gawk"
DESCRIPTION = "This package contains the symlinks to replace gawk with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gawk-1.36.1-29.1.noarch.rpm"
RPM_HASH = "76196a0ecd2d32db3a64438cc53279a426ba20ea2ee88b55a3b9605245f1103e2bdb4c1ed409b34af0aa2493d87c955d5728f68ae96faeefcd8cd382aba780f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/awk \
busybox-gawk"

RDEPENDS:${PN} += "busybox"

inherit rpm
