SUMMARY = "Busybox applets replacing selinux-tools"
DESCRIPTION = "This package contains the symlinks to provide selinux-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-selinux-tools-1.36.1-29.1.noarch.rpm"
RPM_HASH = "4f489906b5123e30d08eaaf15ad1d402f07f016f2951017ff1d3f25df2acb003d258619cdb24cbc05656f449af7367e169aa997f0edcc99b5d7d769fce56a350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-selinux-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
