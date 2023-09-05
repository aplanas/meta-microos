SUMMARY = "Busybox applets replacing net-tools"
DESCRIPTION = "This package contains the symlinks to replace net-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-net-tools-1.36.1-29.1.noarch.rpm"
RPM_HASH = "b53a58a24d645764459e6516888f9148fd1b0f55c1088a5554ffcb6b31d937c9d18ae7511defdbbbdf0e6bfcb749ff5c4b3a778eb4ad194b37b0277ac29d3609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-net-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
