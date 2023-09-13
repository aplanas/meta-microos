SUMMARY = "Busybox applets replacing kmod"
DESCRIPTION = "This package contains the symlinks to replace kmod with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kmod-1.36.1-30.1.noarch.rpm"
RPM_HASH = "220a58830a25154c6e2b611c57d6f3c09ce34e1ee6d6aa6ca2b494cf1c58e0ed8d701308674892274be0094ad8f5fb70a1798bb95aef78d15906f327183eb4bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/modprobe \
busybox-kmod"

RDEPENDS:${PN} += "busybox"

inherit rpm
