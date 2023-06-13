SUMMARY = "Busybox applets replacing ncurses-utils"
DESCRIPTION = "This package contains the symlinks to replace ncurses-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-ncurses-utils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "350a4ea419976835b934f30e44c849b23223de3d8afd2b828c3c2b3c560b3c48dad027f9fba99914b62227a0ab27bb929ed9a6019a655df2f9bfafe3cbdc1e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ncurses-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
