SUMMARY = "Header files for AppStream development"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using AppStream. \
 \
This package contains the documentation for AppStream."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-devel-0.16.1-2.3.aarch64.rpm"
RPM_HASH = "ab036ceacdd0fee7173be885b50307d600d7a2449aed30a1d229c6989e814808246a35c231a79f293edf983f709fe9af710bd3046811c2fb993ef7cb96d611c0"

RPROVIDES:${PN} += "AppStream-devel AppStream-devel(aarch-64) pkgconfig(appstream)"
RDEPENDS:${PN} += "/usr/bin/pkg-config AppStream libappstream4 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0)"

inherit rpm
