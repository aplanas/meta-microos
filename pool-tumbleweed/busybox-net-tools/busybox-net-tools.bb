SUMMARY = "Busybox applets replacing net-tools"
DESCRIPTION = "This package contains the symlinks to replace net-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-net-tools-1.36.1-30.1.noarch.rpm"
RPM_HASH = "1b15cadbf43cf9044ee02ea780c97dbf76ce696d3308f9b3147a2f5a625583d44885e0ce5a95e4413212e222655caba88d8ce153fa72640e59e1367c4421efe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-net-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
