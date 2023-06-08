SUMMARY = "Busybox applets replacing cpio"
DESCRIPTION = "This package contains the symlinks to replace cpio with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-cpio-1.36.0-26.3.noarch.rpm"
RPM_HASH = "29b584d312fc977355019f46dfbfcbd2d2d61d5b59631ffc874413422ce49e90ea5c6d8d30ba7281caf20c034c1693da1c95ce2aba3b4493b1b8e3cd1570eb56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-cpio"
RDEPENDS:${PN} += "busybox"

inherit rpm
