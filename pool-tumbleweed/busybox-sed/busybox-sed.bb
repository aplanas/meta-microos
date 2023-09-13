SUMMARY = "Busybox applets replacing sed"
DESCRIPTION = "This package contains the symlinks to replace sed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sed-1.36.1-30.1.noarch.rpm"
RPM_HASH = "52dc3d4151e0b5b3f4b4688e45df664c74a0fdb81d7e6ae2aacb1b55f813f3e7c335318e6292188fb0cdd11f40096f47b70cbf620b34a3fd2aecc561e7556856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sed \
busybox-sed"

RDEPENDS:${PN} += "busybox"

inherit rpm
