SUMMARY = "Busybox applets replacing dos2unix"
DESCRIPTION = "This package contains the symlinks to provide dos2unix with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-dos2unix-1.36.1-30.1.noarch.rpm"
RPM_HASH = "89ef959d2d2dfbfc3938f20cee79143f914cd3cfa32cb3395dfc6c73280bd5cff32ce35c7bf14baed29b2b67fde1b8e66ee75181e1335e52a6f40d69eea124c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-dos2unix"

RDEPENDS:${PN} += "busybox"

inherit rpm
