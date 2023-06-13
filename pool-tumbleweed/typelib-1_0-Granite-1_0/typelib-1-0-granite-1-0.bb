SUMMARY = "Introspection bindings for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package provides the GObject Introspection bindings for libgranite."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "typelib-1_0-Granite-1_0-6.2.0-1.7.aarch64.rpm"
RPM_HASH = "389ff4c8f9d1b2843c0508ede948dea6c5a7aefb1b66e79d900f2d4ba85a17f56d7542b57b7d75a60d26cafba916867ca8d7a510a0f5f85822cb7cbe0e26185a"

RPROVIDES:${PN} += "typelib(Granite) \
typelib-1_0-Granite-1_0 \
typelib-1_0-Granite-1_0(aarch-64)"

RDEPENDS:${PN} += "libgranite.so.6()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gee) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
