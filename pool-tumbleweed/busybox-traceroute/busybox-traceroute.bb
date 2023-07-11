SUMMARY = "Busybox applets replacing traceroute"
DESCRIPTION = "This package contains the symlinks to replace traceroute with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-traceroute-1.36.1-27.1.noarch.rpm"
RPM_HASH = "773910405899fb807db5b456cb18790f8694bf103d269faadc5d566d57a0c15c1466eef4b8c673a6412227dd95e03d4ffbd3bf9eb97666a1a3e8be81ea745c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-traceroute"

RDEPENDS:${PN} += "busybox"

inherit rpm
