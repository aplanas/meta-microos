SUMMARY = "Window Navigator Construction Kit (Library Package) -- Introspection bindings"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides the GObject Introspection bindings for libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "typelib-1_0-Wnck-3_0-43.0-3.4.aarch64.rpm"
RPM_HASH = "8275fd915e7719ec4fab0cda61992fbde35962663e1a054b989b8eff67a8238d10cad61c680cd93ea2f935eb7b64ae76968b65b9df68a4a358d95cabbf35da34"

RPROVIDES:${PN} += "typelib-1-0-Wnck-3-0 \
typelib-Wnck"

RDEPENDS:${PN} += "libwnck-3.so.0 \
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
