SUMMARY = "Share files across the LAN"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.4"

RPM_NAME = "warpinator-1.6.4-1.1.noarch.rpm"
RPM_HASH = "6dc8316c69a22cd17901748032a4e17e286b19d54e9f894371a64bf383d515a952b0bc5b5dd91e38f8e1efbbdc268ecbf1fa08d5449d97abc0564e081df73cd2"
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
