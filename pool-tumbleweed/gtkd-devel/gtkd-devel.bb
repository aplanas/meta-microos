SUMMARY = "GtkD devel and header files"
DESCRIPTION = "This package contains the header files for GtkD a D binding and OO wrapper of GTK+"
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "gtkd-devel-3.9.0-2.12.aarch64.rpm"
RPM_HASH = "28c09f6dd59fa19353fde14630383bb7dc5947efc74a2fd8b8dc693055eee75f3c6d934f7d6c2adba24a6e018fccb2cb2b0186df9b5a655d2cb1d2fdd1124427"

RPROVIDES:${PN} += "gtkd-devel \
gtkd-devel(aarch-64) \
pkgconfig(gstreamerd-3) \
pkgconfig(gtkd-3) \
pkgconfig(gtkdgl-3) \
pkgconfig(gtkdsv-3) \
pkgconfig(peasd-3) \
pkgconfig(vted-3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgstreamerd-3-0 \
libgtkd-3-0 \
libgtkdgl-3-0 \
libgtkdsv-3-0 \
libpeasd-3-0 \
libvted-3-0 \
pkgconfig(atk) \
pkgconfig(cairo) \
pkgconfig(cairo-gobject) \
pkgconfig(gdk-3.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-base-1.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(gtkd-3) \
pkgconfig(gtkglext-1.0) \
pkgconfig(gtksourceview-3.0) \
pkgconfig(libpeas-1.0) \
pkgconfig(libpeas-gtk-1.0) \
pkgconfig(librsvg-2.0) \
pkgconfig(pango) \
pkgconfig(pangocairo) \
pkgconfig(vte-2.91)"

inherit rpm
