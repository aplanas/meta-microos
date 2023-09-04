SUMMARY = "Busybox applets replacing bind-utils"
DESCRIPTION = "This package contains the symlinks to replace bind-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bind-utils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "0b80b3c9abb61642ed2bbc841e47be791fc2000c13c99b32734be0c92fcd8cd30ad8a233fddcf83f6d21976859041e6e1436b3d667e95bac7b40200980765a58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bind-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
