SUMMARY = "Busybox applets containing adduser and some shadow tools"
DESCRIPTION = "This package contains the symlinks for adduser and some tools from the \
shadow suite."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-adduser-1.36.1-27.1.noarch.rpm"
RPM_HASH = "acf44876b95ae6b9c20900edae3d48317f572417e7310c97094de34774a7d4359765e30f4291aa184b6f5ef284354fdadf50ccca68b55960bfb0312eb9402bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-adduser"

RDEPENDS:${PN} += "busybox \
group-nogroup"

inherit rpm
