SUMMARY = "Busybox applets replacing dos2unix"
DESCRIPTION = "This package contains the symlinks to provide dos2unix with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-dos2unix-1.36.1-29.1.noarch.rpm"
RPM_HASH = "ba5044026ce45513768c2a1948ec472fb7629ad99e3baa001ccb41fcd172acfd3bf8f70d92e11a2b4f42e3a201a44321ff571f97ea0379ae83867cb5940faa51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-dos2unix"

RDEPENDS:${PN} += "busybox"

inherit rpm
