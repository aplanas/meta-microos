SUMMARY = "Busybox applets replacing bind-utils"
DESCRIPTION = "This package contains the symlinks to replace bind-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bind-utils-1.36.1-27.1.noarch.rpm"
RPM_HASH = "edd2d8e3be40ce2a0970d11c6bad97ca414e959d7758f418cfecfcad449b253d33dd579a63e8cee353156817cb67132aa822e9c70afdcd232d39e1bc5822e92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bind-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
