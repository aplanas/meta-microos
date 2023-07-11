SUMMARY = "Busybox applets replacing bzip2"
DESCRIPTION = "This package contains the symlinks to replace bzip2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bzip2-1.36.1-27.1.noarch.rpm"
RPM_HASH = "b44dc610bbfba57dac73837a8e823e30b53bd94238b96217f6ae0633fa8664a8f5bb1f405d070afc4b8b09daf65021e7619fb2c53aa413bb0864a9baa7b620f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bzip2"

RDEPENDS:${PN} += "busybox"

inherit rpm
