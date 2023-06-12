SUMMARY = "Header files for AppStream Compose support"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support using compose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-compose-devel-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "254cd6703046ae04003ac56243f630cf59ca56fde8fdfbf09a5a9c0027297842d3f54ce25b38a9eee9a72c0823c86d67275007fc1f24f6e995a5df5c1a7880fd"

RPROVIDES:${PN} += "AppStream-compose-devel AppStream-compose-devel(aarch-64) pkgconfig(appstream-compose)"
RDEPENDS:${PN} += "/usr/bin/pkg-config AppStream AppStream-compose pkgconfig(appstream) pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0)"

inherit rpm
