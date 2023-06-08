SUMMARY = "Kangaroo applet"
DESCRIPTION = "Kangaroo is an applet for quick & easy browsing, across (possibly) many directory layers, without having to do a single mouse click."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-kangaroo-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "c9ed45836417898afd1d13dd664821ae39f112eccb340b7e35aa0968de4a666c4f05a75898907825d95957005d9ed77f6a7ae166debf733db34a25ccb17b1fa5"

RPROVIDES:${PN} += "budgie-kangaroo-applet budgie-kangaroo-applet(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python3-gobject-Gdk python3-psutil typelib(Budgie) typelib(GObject) typelib(Gtk) xdg-utils zenity"

inherit rpm
