SUMMARY = "Clockworks applet"
DESCRIPTION = "A multi-clock applet to show the time across multiple timezones. \
Clocks can be created and deleted in a single click, and easily be (re-) named. \
Timezones can be looked up from the applet's popup menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-clockworks-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "6c0d39368a9f7bc60d7d81f551dcff2b3f057a9eac904337c706cb3c3a6a2c8cceb7f08d8f60d1c4d642401cea891b43b932994cb4511298de6d91014d04d11a"

RPROVIDES:${PN} += "budgie-clockworks-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-CairoSVG \
python3-Pillow \
python3-gobject-Gdk \
python3-svgwrite \
typelib-Budgie \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk"

inherit rpm
