SUMMARY = "Eekboard libraries -- Introspection bindings"
DESCRIPTION = "This package contains the libraries for eekboard"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "typelib-1_0-Eek-0_90-1.0.8-10.10.aarch64.rpm"
RPM_HASH = "c6ee0b9310fbb2b1988e92ed17178bc6600c20316a617e6f73178d1b03b4f5c5148f8467f90db3f48809d4e0f37c3681b27cafe0623fe8e1c4655641f593d959"

RPROVIDES:${PN} += "typelib-1-0-Eek-0-90 \
typelib-Eek \
typelib-EekGtk \
typelib-EekXkl \
typelib-Eekboard"

RDEPENDS:${PN} += "eekboard \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libeekboard.so.0 \
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
