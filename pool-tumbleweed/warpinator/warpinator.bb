SUMMARY = "Share files across the LAN"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "warpinator-1.6.1-1.1.noarch.rpm"
RPM_HASH = "41d31b4a8e69920738e653ed576ca585a38a08f8fc6d6296e5252d8e5924bb93eecfe2b56aed08b12295f53dc039b34ed26a32aba18f0566a3cec0f7244a47c5"
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
