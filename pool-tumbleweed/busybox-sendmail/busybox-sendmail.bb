SUMMARY = "Busybox applets replacing sendmail"
DESCRIPTION = "This package contains the symlinks to replace sendmail with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sendmail-1.36.1-28.1.noarch.rpm"
RPM_HASH = "c52f4d3f099502fd5eef8b7e24bd0a09557fe4ca9c277191e3dec24ffd446e0e0d5234a4604568f7426f9f400382c15b5252f1534b240083d32c3dabe87c8b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sendmail \
smtp-daemon"

RDEPENDS:${PN} += "busybox"

inherit rpm
