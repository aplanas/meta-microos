SUMMARY = "Busybox applets replacing iputils"
DESCRIPTION = "This package contains the symlinks to replace iputils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iputils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "08e0190ad86dd9412a9763bb2301bf7bfdfe9a50b27dc694ad6854545fca9baaa99cdf92dbcacdde4968e68194d35fcb743eef3ef82e302f13d1bf62dfcb825b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ping \
busybox-iputils"

RDEPENDS:${PN} += "busybox"

inherit rpm
