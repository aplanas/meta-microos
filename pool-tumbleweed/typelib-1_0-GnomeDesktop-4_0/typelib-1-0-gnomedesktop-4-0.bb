SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeDesktop-4_0-44.0-1.2.aarch64.rpm"
RPM_HASH = "e28e979a3e6b5b785a891183795a21234fb2c03c710d036f5f60b765c1fcd14800d8c474fb4b8e11e6b4fbb23a241c82e2a2bfcad34007dcdb1f0c1fbf35e161"

RPROVIDES:${PN} += "typelib-1-0-GnomeDesktop-4-0 \
typelib-GnomeDesktop"

RDEPENDS:${PN} += "libgnome-desktop-4.so.2 \
typelib-GDesktopEnums \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
