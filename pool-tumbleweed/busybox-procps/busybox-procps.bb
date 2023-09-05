SUMMARY = "Busybox applets replacing procps"
DESCRIPTION = "This package contains the symlinks to replace procps with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-procps-1.36.1-29.1.noarch.rpm"
RPM_HASH = "150f47e1548607a88c1f1c2fcfb0a7e1021d6060d2e949cb43f084de420796e597eeff12248a3ce607d41a2d2c422d35799870649c6986b87086f5d1f120815c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ps \
busybox-procps"

RDEPENDS:${PN} += "busybox"

inherit rpm
