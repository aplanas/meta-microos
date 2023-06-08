SUMMARY = "Busybox applets replacing procps"
DESCRIPTION = "This package contains the symlinks to replace procps with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-procps-1.36.0-26.3.noarch.rpm"
RPM_HASH = "e76817e4c1927b73c2b932ab30bf6c4645ae5eebaa80442d77701de9ba06d1ebcf650fd70e89bfea5fc168b845ab4767f1a20e9ee7f855075df6fa29263213f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/ps busybox-procps"
RDEPENDS:${PN} += "busybox"

inherit rpm
