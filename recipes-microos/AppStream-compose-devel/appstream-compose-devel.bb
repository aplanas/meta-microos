SUMMARY = "Header files for AppStream Compose support"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support using compose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-compose-devel-0.16.1-2.3.aarch64.rpm"
RPM_HASH = "b8ba2b690488abd7efa8e8f1e6f6afaabf52b5430556981750414b7674d778e5bc37fc0706fb8a6b958ddec2e07be15902666f4cee5ebc03e0d295cbfab94abf"

RPROVIDES:${PN} += "AppStream-compose-devel AppStream-compose-devel(aarch-64) pkgconfig(appstream-compose)"
RDEPENDS:${PN} += "/usr/bin/pkg-config AppStream AppStream-compose pkgconfig(appstream) pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0)"

inherit rpm
