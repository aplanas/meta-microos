SUMMARY = "Busybox applets replacing ncurses-utils"
DESCRIPTION = "This package contains the symlinks to replace ncurses-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ncurses-utils-1.36.1-27.1.noarch.rpm"
RPM_HASH = "39f1423243b43e013e56c0f0b208b8bcb279a663db79b2ea618bd47a6cb793788efdaf1456bcde8330495e9c4b4415e22aed6adc06ae78419c2cc3bdec9b688e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ncurses-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
