SUMMARY = "Busybox applets replacing sysvinit-tools"
DESCRIPTION = "This package contains the symlinks to provide sysvinit-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sysvinit-tools-1.36.1-27.1.noarch.rpm"
RPM_HASH = "95843688ac1b1f01de1f77c27f45493a5047c2bdcbcdac21935633e225387f7f274557706c3dab48bf2a3f3fd4f39a122e167a31714f2f4bf7d7367dc3b5cfe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sysvinit-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
