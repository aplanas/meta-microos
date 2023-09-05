SUMMARY = "Busybox applets replacing vlan"
DESCRIPTION = "This package contains the symlinks to provide vlan with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vlan-1.36.1-29.1.noarch.rpm"
RPM_HASH = "e3551497faaf50781c0ffd3f7e03bb816209cab0e137ea61a97cbec982bbc143cccb31b8f1be8f649a1f01424d735b74cccbd8f8954f6f64835aa4c18d01f21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vlan"

RDEPENDS:${PN} += "busybox"

inherit rpm
