SUMMARY = "Introspection bindings for gdk-pixdata"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package provides the GObject Introspection bindings for gdk-pixdata."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "typelib-1_0-GdkPixdata-2_0-2.42.10-1.5.aarch64.rpm"
RPM_HASH = "3913a2ab25e1f72dfb0b45486948ae8a74d599c60e6c143a06ec9df6e2421cc4b94b81d4eafa46b15f8cbec53ef827fae7b50a4bf52df7c9094737f445b7fd32"

RPROVIDES:${PN} += "typelib-1-0-GdkPixdata-2-0 \
typelib-GdkPixdata"

RDEPENDS:${PN} += "libgdk-pixbuf-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
