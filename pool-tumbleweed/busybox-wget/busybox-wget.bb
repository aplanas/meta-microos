SUMMARY = "Busybox applets replacing wget"
DESCRIPTION = "This package contains the symlinks to replace wget with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-wget-1.36.1-28.1.noarch.rpm"
RPM_HASH = "d78f412767b4938d86daaee081515f393af460d0f995a9303d287dae0f21161d551befb0a53753ad4d554574ad6d1999ca43dfbfd9c05fbf1b76ac636889f3fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-wget"

RDEPENDS:${PN} += "busybox"

inherit rpm
