SUMMARY = "Busybox applets replacing sharutils"
DESCRIPTION = "This package contains the symlinks to replace sharutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-sharutils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "3f11d5454f3fabda9c8b1dd42f18e377fa492d9a4f07d568f02e4aaac621d619cba130616167613f789a2f329d472e032a2ec174ff3f0b9124251e455c721036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sharutils"
RDEPENDS:${PN} += "busybox"

inherit rpm
