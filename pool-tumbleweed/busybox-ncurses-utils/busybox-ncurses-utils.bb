SUMMARY = "Busybox applets replacing ncurses-utils"
DESCRIPTION = "This package contains the symlinks to replace ncurses-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ncurses-utils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "8b6b8ef4fa740947e1d1f4237d29e1e4b611af5098a0b0038a0871d4f43d3fa0735b08241f8689565883c72169dd2b18b3a5eb98f818a67fd28b3074530121b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ncurses-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
