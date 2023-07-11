SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-Gdk-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "acf1d89f73ad6fe118ec98ad14115a432d3d388d12fbbb9f7f1067bc9353280d09a093748aaf8e9ab50e3aba8e05b07e451042860fc5fd35b64d05865accaa5d"

RPROVIDES:${PN} += "python3-gobject-Gdk \
python311-gobject-Gdk"

RDEPENDS:${PN} += "python-abi \
python311-gobject \
python311-gobject-cairo \
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
