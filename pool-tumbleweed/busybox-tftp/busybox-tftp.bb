SUMMARY = "Busybox applets replacing tftp"
DESCRIPTION = "This package contains the symlinks to provide tftp with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tftp-1.36.1-30.1.noarch.rpm"
RPM_HASH = "fb53cb4fa2826c855d29febc967d4caac1f10e71447e115e26ba3f5e21814f5e672dcb83212876be554a80888c39bd9320644d14d0b6cb744810208965cab37f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tftp"

RDEPENDS:${PN} += "busybox"

inherit rpm
