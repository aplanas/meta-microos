SUMMARY = "Busybox applets replacing sysvinit-tools"
DESCRIPTION = "This package contains the symlinks to provide sysvinit-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-sysvinit-tools-1.36.0-26.3.noarch.rpm"
RPM_HASH = "5e037b150d367738fe3e56d9ef4888fa3efb5d1074ac1e23e239ab3e7aeea7ddaa81fcfc0485ff2d414465d5c8629e4081ff3b983de0a652f8093505d0ea8e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sysvinit-tools"
RDEPENDS:${PN} += "busybox"

inherit rpm
