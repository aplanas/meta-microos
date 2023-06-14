SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.31.0"

RPM_NAME = "libwnck2-devel-2.31.0-13.3.aarch64.rpm"
RPM_HASH = "79697a467959bbfb76ec7a3e729ec99b5d53b27ea79bee0fe60310d2bf04283f2315bbd23c2442d85faaa8040a89f859489cc78b76c423be200bbc3f211e6d70"

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
