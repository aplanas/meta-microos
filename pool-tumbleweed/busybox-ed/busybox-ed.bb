SUMMARY = "Busybox applets replacing ed"
DESCRIPTION = "This package contains the symlinks to provide ed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ed-1.36.1-30.1.noarch.rpm"
RPM_HASH = "c125c7cde2689706ac392f90e8375f4f76e3aa028a23f137b6f828f6d66ecb0de9c9d2455950c63ebc0d0b759202cb61a711f23ebad558f75afe75029ad7fc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ed"

RDEPENDS:${PN} += "busybox"

inherit rpm
