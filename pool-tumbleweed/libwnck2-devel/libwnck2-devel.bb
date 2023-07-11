SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.31.0"

RPM_NAME = "libwnck2-devel-2.31.0-13.4.aarch64.rpm"
RPM_HASH = "4f9165c59da6f1b8722e7253dc930b2b5c01a60f0d982b5c096fc41b254c4c8dd89de229db2ad1f2ef7ffc0a4eaf75d67aac8d41f519ea3a5f9284f3375cba64"

RPROVIDES:${PN} += "libwnck2-devel \
pkgconfig-libwnck-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwnck-1-22 \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-libstartup-notification-1.0 \
pkgconfig-pango \
pkgconfig-x11 \
pkgconfig-xres \
typelib-1-0-Wnck-1-0"

inherit rpm
