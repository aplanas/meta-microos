SUMMARY = "Busybox applets replacing cpio"
DESCRIPTION = "This package contains the symlinks to replace cpio with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-cpio-1.36.1-29.1.noarch.rpm"
RPM_HASH = "9c88d1a53eaaa7e73c83a7d8409d017586a9c92b1afdd4d19ff9b132480a112941c3a2b6db6616e645a520e87e492b85581494f36adfc03ef58909f353e237b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-cpio"

RDEPENDS:${PN} += "busybox"

inherit rpm
