SUMMARY = "OpenGL Extension to GTK"
DESCRIPTION = "GtkGLExt is an OpenGL extension to GTK. It provides the GDK objects \
which support OpenGL rendering in GTK, and GtkWidget API add-ons to \
make GTK+ widgets OpenGL-capable."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git20110529"

RPM_NAME = "gtkglext-devel-1.2.0git20110529-8.3.aarch64.rpm"
RPM_HASH = "7a4fa08381e62e619181c6ae53446723280058869e8d5e03c4b7d8d1b993a1131ce55f00a66fadebb5a7a2ef2ad0d814e67666b6dbb7d9c32eb3f72b3190bb98"

RPROVIDES:${PN} += "gtkglext-devel \
gtkglext-devel(aarch-64) \
pkgconfig(gdkglext-1.0) \
pkgconfig(gdkglext-x11-1.0) \
pkgconfig(gtkglext-1.0) \
pkgconfig(gtkglext-x11-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-devel \
libgtkglext-x11-1_0-0 \
pkgconfig(gdk-2.0) \
pkgconfig(gdkglext-x11-1.0) \
pkgconfig(gl) \
pkgconfig(gtk+-2.0)"

inherit rpm
