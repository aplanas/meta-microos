SUMMARY = "Busybox applets replacing man"
DESCRIPTION = "This package contains the symlinks to replace man with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-man-1.36.1-29.1.noarch.rpm"
RPM_HASH = "8ca0dfd5b8161f8561137d581b2d123263ffa271e0871ac3230808b65e1d18f7b416d2fd699e7f1610a8453048a8ad58c801e276a801e5cd9ef7db9a0e5e2ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-man"

RDEPENDS:${PN} += "busybox"

inherit rpm
