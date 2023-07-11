SUMMARY = "Busybox applets replacing grep"
DESCRIPTION = "This package contains the symlinks to replace grep with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-grep-1.36.1-27.1.noarch.rpm"
RPM_HASH = "8efa2a48adabe5e42133e5af47cadcabbc51ee9d768cdd45a7958b67638eed704ffc399e17b10d2a7f2a6f8a36377b74493020dc7f3909ed90c2c659a18fd38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/grep \
busybox-grep"

RDEPENDS:${PN} += "busybox"

inherit rpm
