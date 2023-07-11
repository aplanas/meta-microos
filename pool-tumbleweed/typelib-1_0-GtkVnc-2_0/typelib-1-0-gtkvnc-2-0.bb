SUMMARY = "A GTK widget for VNC clients -- Introspection bindings"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the \
libgtk-vnc library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "typelib-1_0-GtkVnc-2_0-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "030f5840494792a56d1516983d720eebdb37005b80f688f6b2e035c697425ff251ade99fdef92eac21a7ce4815fc029cca8e81a32bd28a6b1e74f2140e73beb7"

RPROVIDES:${PN} += "typelib-1-0-GtkVnc-2-0 \
typelib-GtkVnc"

RDEPENDS:${PN} += "libgtk-vnc-2.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GVnc \
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
