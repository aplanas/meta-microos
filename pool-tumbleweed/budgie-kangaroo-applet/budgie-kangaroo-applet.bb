SUMMARY = "Kangaroo applet"
DESCRIPTION = "Kangaroo is an applet for quick & easy browsing, across (possibly) many directory layers, without having to do a single mouse click."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-kangaroo-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "d2d0bca3ead03a0004286a31c8121f4909d800557180250d3ac12e628c12289e2cde19e35db235d4f1a082d0fe5c3b94d58cba6e048bc7aaebfe2500d303f355"

RPROVIDES:${PN} += "budgie-kangaroo-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
python3-psutil \
typelib-Budgie \
typelib-GObject \
typelib-Gtk \
xdg-utils \
zenity"

inherit rpm
