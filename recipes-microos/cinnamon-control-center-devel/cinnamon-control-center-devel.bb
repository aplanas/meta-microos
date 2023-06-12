SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "cinnamon-control-center-devel-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "b280fd19f4734820bf7d0eeb22ebd197251bfcf8fb802d8d105316c8507658371c6e22233332c354364d2027cc90d1959a0a3793ad936d07fde6dfef117d7437"

RPROVIDES:${PN} += "cinnamon-control-center-devel cinnamon-control-center-devel(aarch-64) pkgconfig(libcinnamon-control-center)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcinnamon-control-center1 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0)"

inherit rpm
