SUMMARY = "Busybox applets replacing hostname"
DESCRIPTION = "This package contains the symlinks to replace hostname with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hostname-1.36.1-28.1.noarch.rpm"
RPM_HASH = "7aa079437967b1d311363808bc76e44710117f3eef4911ad036a7da03c383829b3e2e74b141a794fbd744a141161118633b46554219abdad29695d95cd81e875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/hostname \
busybox-hostname"

RDEPENDS:${PN} += "busybox"

inherit rpm
