SUMMARY = "Busybox applets replacing hostname"
DESCRIPTION = "This package contains the symlinks to replace hostname with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hostname-1.36.1-30.1.noarch.rpm"
RPM_HASH = "274f8c8ae1b340179560f4094c4f52aeff81d16093d0553d182606519763cc6da750a2e4c3161127fea9a6315a709cc4eac027a8b051c2c1c8cf35ec72dc87a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/hostname \
busybox-hostname"

RDEPENDS:${PN} += "busybox"

inherit rpm
