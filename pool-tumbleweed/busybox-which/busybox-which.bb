SUMMARY = "Busybox applets replacing which"
DESCRIPTION = "This package contains the symlinks to replace which with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-which-1.36.0-26.3.noarch.rpm"
RPM_HASH = "cf40636353c5611276b7cee51aa816eca35ee6583d247cec8f00a1e12e84746d965e9bb946639a25a2bb1edb1712253ec01632a60ba82dde61218a41cc510aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-which"
RDEPENDS:${PN} += "busybox"

inherit rpm
