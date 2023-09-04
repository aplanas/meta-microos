SUMMARY = "Busybox applets replacing ncurses-utils"
DESCRIPTION = "This package contains the symlinks to replace ncurses-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ncurses-utils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "5223fbe6fbd6425e654e42336cf4f43e31f690c0ab982e59677cbaec88374cd7a8767908fc1721bcbdc9b5f279aa3499136408e1f8fe0def377d3046526cc50b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ncurses-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
