SUMMARY = "Busybox applets replacing tunctl"
DESCRIPTION = "This package contains the symlinks to provide tunctl with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tunctl-1.36.1-29.1.noarch.rpm"
RPM_HASH = "898b8ae830b6530608ad3c45e606ad082433c791a91f836e833cf90ff1c3b0dc12aa78d6b10f705277e81b53e38348f6cabb7ea9fd4de012ef65b68c6632ce91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tunctl"

RDEPENDS:${PN} += "busybox"

inherit rpm
