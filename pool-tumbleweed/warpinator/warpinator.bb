SUMMARY = "Share files across the LAN"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.3"

RPM_NAME = "warpinator-1.6.3-1.2.noarch.rpm"
RPM_HASH = "e0b16fd10e066a925995d608a91e1bea0fe99f6f2a64c23821bab781540c259799509e2717e48b4840add77659a89b1e0f75ad6b87af7f7e2ddc65948651960f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warpinator"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-PyNaCl \
python3-cryptography \
python3-gobject-Gdk \
python3-grpcio \
python3-netifaces \
python3-protobuf \
python3-setproctitle \
python3-xapp \
python3-zeroconf \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-XApp"

inherit rpm
