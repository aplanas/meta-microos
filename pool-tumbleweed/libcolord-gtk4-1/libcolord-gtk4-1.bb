SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Library"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libcolord-gtk4-1-0.3.0-2.1.aarch64.rpm"
RPM_HASH = "316d2624819a26b9b98ee0afa080eb267f7eae4196da0873281b469ca6c4bb9819bc9dbc4dcc0192e224e535bce9b5f7db97f0fc9b60bcd1a69633947d56503b"

RPROVIDES:${PN} += "libcolord-gtk4-1 \
libcolord-gtk4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
