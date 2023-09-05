SUMMARY = "Busybox applets replacing hostname"
DESCRIPTION = "This package contains the symlinks to replace hostname with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hostname-1.36.1-29.1.noarch.rpm"
RPM_HASH = "95a804de4a11da5b403dc2b86dd28f089a1f5bde6b6f32099465ff066c340a777c356ef4656f83bad6698f071132b6fd6a355d27791c761766eca9f108fa7e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/hostname \
busybox-hostname"

RDEPENDS:${PN} += "busybox"

inherit rpm
