SUMMARY = "Busybox applets replacing time"
DESCRIPTION = "This package contains the symlinks to provide time with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-time-1.36.0-26.3.noarch.rpm"
RPM_HASH = "545f53dfab3ed8b2409351441e4373b8eb62a5c02c04fb42756aa568047d598563e82d4f6d44de2c87eedbd0df3c021783e177bd6835d486147a7e43a67b6c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-time"

RDEPENDS:${PN} += "busybox"

inherit rpm
