SUMMARY = "Busybox applets replacing sha3sum"
DESCRIPTION = "This package contains the symlinks to replace sha3sum with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sha3sum-1.36.1-27.1.noarch.rpm"
RPM_HASH = "defc0677cd89ece1e0a876fb2bd77cde4737a0c540132a3faee6ceb2e2290c44799e70f4413592088fbabdafd378661b34e210347b81939c22af05c5f490bbfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sha3sum"

RDEPENDS:${PN} += "busybox"

inherit rpm
