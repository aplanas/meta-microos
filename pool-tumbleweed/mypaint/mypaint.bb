SUMMARY = "Graphics application for digital painters"
DESCRIPTION = "MyPaint is a graphics application for digital painters. It supports \
graphics tablets made by Wacom, and many similar devices. The \
standard brushes can emulate traditional media like charcoal, \
pencils, ink, or paint."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "mypaint-2.0.1-4.1.aarch64.rpm"
RPM_HASH = "2ef4d08ca04340d68bc372bf0a6555d118fbd8f04b289f571b5ac9d267376e58eb33bdad562f63abc45f811511dbab316e7a8cd1df046a95e1c6ecf8b261bac3"

RPROVIDES:${PN} += "mypaint"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgomp.so.1 \
liblcms2.so.2 \
libm.so.6 \
libmypaint.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
mypaint-brushes \
python3-gobject-Gdk \
python3-numpy \
python3-pycairo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
