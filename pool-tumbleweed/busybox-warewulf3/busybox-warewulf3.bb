SUMMARY = "Static version of Busybox - for building Warewulf3"
DESCRIPTION = "This version of busybox is only for building Warewulf3 \
https://github.com/warewulf/warewulf3"
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-warewulf3-1.36.0-1.3.aarch64.rpm"
RPM_HASH = "160186ae997f9a23585b67f060b5c71f84134dfaa73a45fa7d8ebdce9fa974c4e779b816f2d1ce50c5c1eab3c2541988af81bca9155a95052498c37f184ee306"

RPROVIDES:${PN} += "busybox-warewulf3 \
busybox-warewulf3(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
