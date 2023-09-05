SUMMARY = "Header files for AppStream development"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using AppStream. \
 \
This package contains the documentation for AppStream."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.3"

RPM_NAME = "AppStream-devel-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "53a3d823df3c720c37edb592634eba4f7f4f817ac5c6350a0612a6973137b75ce7081617f2fba802394a7f42d669801e82df87f89788c33b4c902d9f426154d3"

RPROVIDES:${PN} += "AppStream-devel \
pkgconfig-appstream"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
AppStream \
libappstream4 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
