SUMMARY = "Busybox applets replacing sysvinit-tools"
DESCRIPTION = "This package contains the symlinks to provide sysvinit-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sysvinit-tools-1.36.1-30.1.noarch.rpm"
RPM_HASH = "8083e704ed162112d7449893783e28ca2bdcee41931ed548a916b64c2f546c2d559ec06d6f7f8468ae69a851f60f83d55157bac819716693cbeb01185d8d9622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sysvinit-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
