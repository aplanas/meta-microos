SUMMARY = "Window Navigator Construction Kit (Library Package) -- Introspection bindings"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides the GObject Introspection bindings for libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "2.31.0"

RPM_NAME = "typelib-1_0-Wnck-1_0-2.31.0-13.4.aarch64.rpm"
RPM_HASH = "f7e86c116649079ef347e8a0b786ae5193c253bcb0587085732f6017f757edf695e46d3f38540b4ba1f2657812163e196228d58db0b9742a8808a4519f77a05c"

RPROVIDES:${PN} += "typelib-1-0-Wnck-1-0 \
typelib-Wnck"

RDEPENDS:${PN} += "libwnck-1.so.22 \
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
typelib-freetype2"

inherit rpm
