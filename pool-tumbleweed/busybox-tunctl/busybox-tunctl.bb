SUMMARY = "Busybox applets replacing tunctl"
DESCRIPTION = "This package contains the symlinks to provide tunctl with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tunctl-1.36.1-28.1.noarch.rpm"
RPM_HASH = "33432ebb7d571a95aa095e6e7d5ebf6c7f2f5e73cafe90d034a045518f19520767cd03a2e600b5e6e105d50f8a2811519ca5481f61d7f92329ba7e0a2dd8d751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tunctl"

RDEPENDS:${PN} += "busybox"

inherit rpm
