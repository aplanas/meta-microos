SUMMARY = "Introspection bindings for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "typelib-1_0-Gtk-2_0-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "5ae290ba61b2724d982ab1f84f4bc173a456d7dbf26f72b5006100ce6410d315ae955df2d59e16842cd67883f582cea0b7394ed8c82a1944da0bd55d6eff7c63"

RPROVIDES:${PN} += "typelib(Gdk) \
typelib(GdkX11) \
typelib(Gtk) \
typelib-1_0-Gtk-2_0 \
typelib-1_0-Gtk-2_0(aarch-64)"
RDEPENDS:${PN} += "libgdk-x11-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
