SUMMARY = "Introspection bindings for libdbusmenu-gtk4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the GTK+ 2 version \
of the dbusmenu-gtk library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-DbusmenuGtk-0_4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "7601fa0b3899da22a50ba10a3c9b040e0c18a252feda3a84b21cb356c65d0d841ccbeee4a1f535dec97f1ff420f6b39b273304ceba92dcc902f418e596481d3e"

RPROVIDES:${PN} += "typelib(DbusmenuGtk) \
typelib-1_0-DbusmenuGtk-0_4 \
typelib-1_0-DbusmenuGtk-0_4(aarch-64)"

RDEPENDS:${PN} += "libdbusmenu-glib.so.4()(64bit) \
libdbusmenu-gtk.so.4()(64bit) \
typelib(Atk) \
typelib(Dbusmenu) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
