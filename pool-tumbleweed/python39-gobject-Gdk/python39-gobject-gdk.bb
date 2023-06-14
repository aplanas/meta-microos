SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-Gdk-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "edf1d5eb040dc2974b313a8729216ab53f89c41c3c90c6b960385bc8697033974e9286fc848ed90849ee5d151a5f16c88a7592f7127def48ba13ca538dbd2d3c"

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
