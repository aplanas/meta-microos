SUMMARY = "A GTK widget for VNC clients -- Introspection bindings"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the \
libgtk-vnc library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "typelib-1_0-GtkVnc-2_0-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "95e9431d2b9f18b043b87fad11d6eac38b86ded9d343baa4886c9608f5ee450776f6bf7d65ddea9ca1e33321c4f47435bac5cbfe9ab9093c30d06f661fbef49f"

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
