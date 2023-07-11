SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "libwnck-devel-43.0-3.4.aarch64.rpm"
RPM_HASH = "5f6f5cc1953f2da67f62b778af0237652732650302c50de61f1ef693698b132f47bdd1a48a50d4a30d54eed08367d0722bf1f3dcf05da59ff278efa2b0fbafb7"

RPROVIDES:${PN} += "libwnck-devel \
libwnck-doc \
pkgconfig-libwnck-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwnck-3-0 \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libstartup-notification-1.0 \
pkgconfig-pango \
pkgconfig-x11 \
pkgconfig-xres \
typelib-1-0-Wnck-3-0"

inherit rpm
