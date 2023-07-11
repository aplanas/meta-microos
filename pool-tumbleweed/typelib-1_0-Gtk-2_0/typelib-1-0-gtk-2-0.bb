SUMMARY = "Introspection bindings for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "typelib-1_0-Gtk-2_0-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "f7fe7835631f7b994fa35b295375473f1817bf0ac89078ac86afab1d7b47105c9807f5e9095bad5bbd2c55defcc846b9bedcbd8ea382f4d5173604facb1376ea"

RPROVIDES:${PN} += "typelib-1-0-Gtk-2-0 \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gtk"

RDEPENDS:${PN} += "libgdk-x11-2.0.so.0 \
libgtk-x11-2.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
