SUMMARY = "Introspection bindings for gdk-pixdata"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package provides the GObject Introspection bindings for gdk-pixdata."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "typelib-1_0-GdkPixdata-2_0-2.42.10-1.4.aarch64.rpm"
RPM_HASH = "7be892960e3edcd2ac407f0a3108943d1f1ca2a0f79f2edc6cdd41f9083f2bf961552c6b00e4fdf6c7d81256ae74aeab110a2bb3b6d2950f5f6bd6325e1ae2e6"

RPROVIDES:${PN} += "typelib-1-0-GdkPixdata-2-0 \
typelib-GdkPixdata"

RDEPENDS:${PN} += "libgdk-pixbuf-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
