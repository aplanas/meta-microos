SUMMARY = "GObject introspection bindings for libtepl"
DESCRIPTION = "Tepl is a library that eases the development of GtkSourceView-based text \
editors and IDEs. It is a continuation/rename of Gtef. \
 \
This package provides the GObject Introspection bindings for tepl."
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "typelib-1_0-Tepl-6-6.4.0-1.5.aarch64.rpm"
RPM_HASH = "334c81f1a7d350ac4d16dd78a7f2d76c82b31375dba529191c6b61b8510d77f0549c82e0224dc83dbab4166ace273059782d29031b04c13f93ae21edf6f64567"

RPROVIDES:${PN} += "typelib(Tepl) \
typelib-1_0-Tepl-6 \
typelib-1_0-Tepl-6(aarch-64)"
RDEPENDS:${PN} += "libtepl-6.so.2()(64bit) \
typelib(Amtk) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
