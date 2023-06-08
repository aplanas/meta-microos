SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.6.1"

RPM_NAME = "cinnamon-control-center-devel-5.6.1-1.3.aarch64.rpm"
RPM_HASH = "05def10a78c13496ad3d5197ce711cf847d847aa66cb3cbe3d3c81fdf16d4d725c55cadbe76c1be6f893c0ff963f7e4c38e6c9950bf9bedd7cb02f0c6baad1e8"

RPROVIDES:${PN} += "cinnamon-control-center-devel cinnamon-control-center-devel(aarch-64) pkgconfig(libcinnamon-control-center)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcinnamon-control-center1 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0)"

inherit rpm
