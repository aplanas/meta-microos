SUMMARY = "Busybox applets replacing less"
DESCRIPTION = "This package contains the symlinks to replace less with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-less-1.36.1-27.1.noarch.rpm"
RPM_HASH = "e8257464dfbc4c9994470332888a33d951e1b5f486b062370d15f3f5da955cde9f91475750e4c95e1f3a8618a5560684b4b59e174b928b5c6f37639e103dee60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-less"

RDEPENDS:${PN} += "busybox"

inherit rpm
