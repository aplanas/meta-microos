SUMMARY = "A simple drawing application for Linux"
DESCRIPTION = "This application is a free basic image editor, similar to Microsoft Paint, is aiming at the GNOME desktop. \
 \
PNG, JPEG and BMP files are supported. \
 \
Besides GNOME, the app is well integrated in traditional-looking desktops, as well as an elementaryOS layout. \
 \
It should also be compatible with the Pinephone and Librem 5 smartphones."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "drawing-1.0.2-1.1.noarch.rpm"
RPM_HASH = "a426ea971fac23c7febec8d2bb9ad94d887813323f3072a073b2d320fea0a395172a72482aa0d15b21b50ff485f0659cc4112bd616e55a5b904b5e381f9706c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drawing"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pycairo \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
