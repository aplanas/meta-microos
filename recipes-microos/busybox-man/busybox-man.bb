SUMMARY = "Busybox applets replacing man"
DESCRIPTION = "This package contains the symlinks to replace man with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-man-1.36.0-26.3.noarch.rpm"
RPM_HASH = "e2576253bdda94b7bada9013574e13d53e345158b390ad57a4e9fdf56d69d36ec682465347fbde2d1bff0c8779af7b1300261e8472aa28a2458ad540739080b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-man"
RDEPENDS:${PN} += "busybox"

inherit rpm
