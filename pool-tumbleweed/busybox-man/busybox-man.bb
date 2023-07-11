SUMMARY = "Busybox applets replacing man"
DESCRIPTION = "This package contains the symlinks to replace man with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-man-1.36.1-27.1.noarch.rpm"
RPM_HASH = "a075a877a053612c9d54457cdb968a71f9829619bd2b40e4def809c8df0d0a6bffbadc96ac5d15eb7139852717521349362ec10ec7de1129548c0224b7e96839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-man"

RDEPENDS:${PN} += "busybox"

inherit rpm
