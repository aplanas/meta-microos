SUMMARY = "Busybox applets replacing bzip2"
DESCRIPTION = "This package contains the symlinks to replace bzip2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bzip2-1.36.1-28.1.noarch.rpm"
RPM_HASH = "9c5ec668433889475a292686ea924023e85a7531f0270bee97ae5a2af940108b73763924c2069c37df585a3e9a80bfbeb12fb6423cf7ad8ed710931ea1db97d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bzip2"

RDEPENDS:${PN} += "busybox"

inherit rpm
