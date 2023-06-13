SUMMARY = "App Launcher applet"
DESCRIPTION = "App Launcher is a Budgie Desktop applet for productivity. This applet lists your favourite apps."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-app-launcher-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "3cf83efe9264a2358ed96cf63da6d88b412e59b31375fe698e198102f27976ff7bc965492e54ada0901992caeeb1a8dc6d47c59cd563679d59fe5c94e0ca5f7a"

RPROVIDES:${PN} += "budgie-app-launcher-applet \
budgie-app-launcher-applet(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
typelib(Budgie) \
typelib(GMenu) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gtk)"

inherit rpm
