SUMMARY = "Busybox applets replacing man"
DESCRIPTION = "This package contains the symlinks to replace man with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-man-1.36.1-28.1.noarch.rpm"
RPM_HASH = "81f2cbe2babde5be10b84b2c180f96ae6b784b93412a69f0beceb5d38beea58c0e8e10c94d652b4a7e65be3fe5d70965ac42b0b109f1028dd4abb8636254c361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-man"

RDEPENDS:${PN} += "busybox"

inherit rpm
