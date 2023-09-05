SUMMARY = "Busybox applets replacing less"
DESCRIPTION = "This package contains the symlinks to replace less with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-less-1.36.1-29.1.noarch.rpm"
RPM_HASH = "2b587a3c87c9db055d9321e2b82e7564c1b416a8b6807fc7cf54925c18e88d7adf684f6450b39f39b19dad817ba7da061f5b3dde7dd900788263c09eebce8648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-less"

RDEPENDS:${PN} += "busybox"

inherit rpm
