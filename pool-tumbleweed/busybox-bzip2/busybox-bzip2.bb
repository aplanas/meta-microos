SUMMARY = "Busybox applets replacing bzip2"
DESCRIPTION = "This package contains the symlinks to replace bzip2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-bzip2-1.36.0-26.3.noarch.rpm"
RPM_HASH = "a4016b1bfe2a2e1a21394a0cc293c16b9836a8044fe81189eade6cebcfaf3f24d5d48c6b256f5326deba7d9b87d61ca73f25bbdc34535999ae8d19849aa34d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bzip2"

RDEPENDS:${PN} += "busybox"

inherit rpm
