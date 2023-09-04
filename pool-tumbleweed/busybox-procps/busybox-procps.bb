SUMMARY = "Busybox applets replacing procps"
DESCRIPTION = "This package contains the symlinks to replace procps with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-procps-1.36.1-28.1.noarch.rpm"
RPM_HASH = "e493fe1af0208456d5cc01e51807274f5af2a59af3c31259f83e0fab0c2a01667a86ca5226df7d30653206dca90f31583ad56068cd889fa94cb6a691a2847913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ps \
busybox-procps"

RDEPENDS:${PN} += "busybox"

inherit rpm
