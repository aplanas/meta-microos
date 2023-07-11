SUMMARY = "Automatic archives creating and extracting library -- Introspection bindings"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "typelib-1_0-GnomeAutoarGtk-0_1-0.4.4-1.2.aarch64.rpm"
RPM_HASH = "f11204ceb55eca5a799684e0cdc2e547732ff29269e1e2548ed18ab352498c6add830412ae2ec6cc78070af516e70f79ac510fdbc19f65d475c6233f09651104"

RPROVIDES:${PN} += "typelib-1-0-GnomeAutoarGtk-0-1 \
typelib-GnomeAutoarGtk"

RDEPENDS:${PN} += "libgnome-autoar-gtk-0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeAutoar \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
