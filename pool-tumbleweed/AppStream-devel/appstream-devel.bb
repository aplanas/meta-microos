SUMMARY = "Header files for AppStream development"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using AppStream. \
 \
This package contains the documentation for AppStream."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-devel-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "6eac4887f3248b35f3b8e2edacc37129e4f68a1873bf869040d0be58c08cecad06754f271f04f55f9cf6279fe901b864eae857e96db9fbe2ed2722d900492d15"

RPROVIDES:${PN} += "AppStream-devel \
AppStream-devel(aarch-64) \
pkgconfig(appstream)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
AppStream \
libappstream4 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
