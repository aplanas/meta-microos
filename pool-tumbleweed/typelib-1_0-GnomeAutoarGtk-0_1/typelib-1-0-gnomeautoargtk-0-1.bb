SUMMARY = "Automatic archives creating and extracting library -- Introspection bindings"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "typelib-1_0-GnomeAutoarGtk-0_1-0.4.4-1.1.aarch64.rpm"
RPM_HASH = "c84fe0682c3064977f10c8d3fb14a202914a35f115afd97a09002294e56172eedbc20e03290038eb1caa60a1ca18d1e5953a259f9d3acc9db6e5b3a56d093e54"

RPROVIDES:${PN} += "typelib(GnomeAutoarGtk) \
typelib-1_0-GnomeAutoarGtk-0_1 \
typelib-1_0-GnomeAutoarGtk-0_1(aarch-64)"

RDEPENDS:${PN} += "libgnome-autoar-gtk-0.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(GnomeAutoar) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
