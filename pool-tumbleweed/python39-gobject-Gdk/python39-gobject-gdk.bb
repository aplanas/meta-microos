SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-Gdk-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "3ff483be1c035f8dbbb10b96d33e5cf249393f5e6d2207390698059f227703ac2c481453e2068166beeef406040ab31acf6e411e02752644eddabacfa5cbbe78"

RPROVIDES:${PN} += "python39-gobject-Gdk"

RDEPENDS:${PN} += "python-abi \
python39-gobject \
python39-gobject-cairo \
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
