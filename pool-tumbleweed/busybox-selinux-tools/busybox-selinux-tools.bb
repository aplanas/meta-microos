SUMMARY = "Busybox applets replacing selinux-tools"
DESCRIPTION = "This package contains the symlinks to provide selinux-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-selinux-tools-1.36.1-28.1.noarch.rpm"
RPM_HASH = "8b8097ce3322f5eb957b03b29bdaf9dbeaf1376a8221250712e4f3ecedf47bbda6c6ea7ed55d8151df0fe31a1746c443b61d4fc3f40e515d6baac05f1652d634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-selinux-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
