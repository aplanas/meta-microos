SUMMARY = "Busybox applets replacing patch"
DESCRIPTION = "This package contains the symlinks to replace patch with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-patch-1.36.1-29.1.noarch.rpm"
RPM_HASH = "7695b5b374a9960d71c0194f7b0c85f5697faac32c6279b2cb720a37900c80eff123fa375c37fb119366807472d79ffcfe80878110ec2e8f7770487ef1268590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-patch"

RDEPENDS:${PN} += "busybox"

inherit rpm
