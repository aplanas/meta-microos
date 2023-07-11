SUMMARY = "Header files for AppStream development"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using AppStream. \
 \
This package contains the documentation for AppStream."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "AppStream-devel-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "c615ac1484d92e0e888315a046f4083114da60c2590b1ce8cb199f1bf16365a39aa6ed54c8d7d5ef80bfcb203e8676e61b75e74c35cadf3bb6a27c687e687089"

RPROVIDES:${PN} += "AppStream-devel \
pkgconfig-appstream"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
AppStream \
libappstream4 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
