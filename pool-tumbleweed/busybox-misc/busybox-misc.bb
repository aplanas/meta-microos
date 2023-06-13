SUMMARY = "Busybox applets not fitting anywhere else"
DESCRIPTION = "This package contains the symlinks to provide various busybox applets which \
do not fit really to any other package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-misc-1.36.0-26.3.noarch.rpm"
RPM_HASH = "168bb90b02af69571802e63f46b942c623a02087086a315221d169842b997d87087370836f92bd6fa76fee17bf980c3fa58a45b4e2c099261ceffd0478db0c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-misc"

RDEPENDS:${PN} += "busybox"

inherit rpm
