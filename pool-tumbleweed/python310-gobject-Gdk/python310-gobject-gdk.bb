SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-Gdk-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "d756eacbb020ce7009561f2b8ecf72450350ae6bcb6a379aac7ce13b2360b2252f74e0ff9269fab50d8e18584ee66e3d9a8d2ad8b8f6a886fe23f327c6ee4b39"

RPROVIDES:${PN} += "python310-gobject-Gdk"

RDEPENDS:${PN} += "python-abi \
python310-gobject \
python310-gobject-cairo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-cairo"

inherit rpm
