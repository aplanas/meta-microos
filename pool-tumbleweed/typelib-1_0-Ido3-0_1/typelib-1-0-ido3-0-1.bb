SUMMARY = "Indicator Display Objects typelib"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package provides the GObject Introspection bindings for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "typelib-1_0-Ido3-0_1-13.10.0+bzr20161028-3.17.aarch64.rpm"
RPM_HASH = "34bdd4cd33995117737b179c5c25804fd0ab5428965632d460bdadee54b1a952d429aa7c92d58e642e0f5128adfdc9417866e3981294dd83558083c910273cbf"

RPROVIDES:${PN} += "typelib-1-0-Ido3-0-1 \
typelib-Ido3"

RDEPENDS:${PN} += "libido3-0.1.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
