SUMMARY = "App Launcher applet"
DESCRIPTION = "App Launcher is a Budgie Desktop applet for productivity. This applet lists your favourite apps."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-app-launcher-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "ab8d9ab8833ca91318c817fa65f7125854f189ab768e65c3e028c224ee4369063eaa77c097b7f2eb73bfe6e8d4353680a900e3892fed7ae9dc5a135c223abfef"

RPROVIDES:${PN} += "budgie-app-launcher-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
typelib-Budgie \
typelib-GMenu \
typelib-GObject \
typelib-Gdk \
typelib-Gtk"

inherit rpm
