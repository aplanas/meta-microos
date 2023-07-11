SUMMARY = "Busybox applets replacing findutils"
DESCRIPTION = "This package contains the symlinks to replace findutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-findutils-1.36.1-27.1.noarch.rpm"
RPM_HASH = "b836d2ad1d3940ca3ffeaf672893e54203c83c93c0c2541ab397e9a25581d646e4d228048e2ce03f6ef66e5e7f475b7b823d28d844859a969e9f4cc8084f6632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-findutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
