SUMMARY = "Busybox applets replacing net-tools"
DESCRIPTION = "This package contains the symlinks to replace net-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-net-tools-1.36.0-26.3.noarch.rpm"
RPM_HASH = "2e7d56b376e79b8914ab8e0da8aa6ecb449436e2e41df3961a3ff28c221ef5ee0555af0b899fe0cdeee89f03d885569be6cc223d7aa576eb6e2d3525b554fc6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-net-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
