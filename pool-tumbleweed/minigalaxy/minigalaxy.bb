SUMMARY = "A GOG client for Linux that lets you download and play your GOG Linux games"
DESCRIPTION = "A GOG client for Linux that lets you download and play your GOG Linux games."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "minigalaxy-1.2.2-1.3.noarch.rpm"
RPM_HASH = "a55aeadb72c5cf1dfbcd66f5783dd1167c030d5dde7577f813b362b778505b6d04b94aa92e899fc9b24da41c1016cf8618f1bf7edb4185a8d5853eb4c530af90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minigalaxy \
python3.11dist-minigalaxy \
python3dist-minigalaxy"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-requests \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-WebKit2"

inherit rpm
