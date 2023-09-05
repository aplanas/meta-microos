SUMMARY = "Busybox applets replacing sharutils"
DESCRIPTION = "This package contains the symlinks to replace sharutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sharutils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "572f18b2cabed854bb2b531dc0fdb73f9e7b8d88d9355b2c88255d722c7247ad95fa5cc0133d2710243bb128cc127fc182091b7e5f1669957f34e9e290ee4ccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sharutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
