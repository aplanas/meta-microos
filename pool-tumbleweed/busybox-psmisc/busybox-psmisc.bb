SUMMARY = "Busybox applets replacing psmisc"
DESCRIPTION = "This package contains the symlinks to replace psmisc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-psmisc-1.36.1-28.1.noarch.rpm"
RPM_HASH = "798de03e08554547bb2088475337f238856a8598078f94e6537cb3bced1e0c3039fc385951758f04230f7a9dcddb863eed736c93ecaaaa799e7b62fd78183ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/fuser \
busybox-psmisc"

RDEPENDS:${PN} += "busybox"

inherit rpm
