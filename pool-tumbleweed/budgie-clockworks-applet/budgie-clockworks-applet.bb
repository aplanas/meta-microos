SUMMARY = "Clockworks applet"
DESCRIPTION = "A multi-clock applet to show the time across multiple timezones. \
Clocks can be created and deleted in a single click, and easily be (re-) named. \
Timezones can be looked up from the applet's popup menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-clockworks-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "1ea9ddb293cf02e19cb6655569e27dbb6c071dca9f36747c0fab8f9df06da3dd802f5571938397c52b5b3134ac43b0c00eac4af540e512249de221545eea9e89"

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
