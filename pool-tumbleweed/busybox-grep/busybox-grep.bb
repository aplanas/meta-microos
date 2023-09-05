SUMMARY = "Busybox applets replacing grep"
DESCRIPTION = "This package contains the symlinks to replace grep with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-grep-1.36.1-29.1.noarch.rpm"
RPM_HASH = "ad1184acacdf17d533a51ab59ac49b1c7d33c1bc4e4b7c7f75e73cb0d0a2495d5ba9c78152cb42d888e84cd87940679442161e11e1424ff41a5e8de26215a59a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/grep \
busybox-grep"

RDEPENDS:${PN} += "busybox"

inherit rpm
