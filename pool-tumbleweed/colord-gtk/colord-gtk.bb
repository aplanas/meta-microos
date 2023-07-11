SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "colord-gtk-0.3.0-2.1.aarch64.rpm"
RPM_HASH = "094e740f779718975cd7c65c18d0b56f23d1fc9207433cb2edd15f02ff293ac49133e62d7531d34058b37dae34de378f9964d6014f827f6c17ec54d83831caf2"

RPROVIDES:${PN} += "colord-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcolord-gtk.so.1 \
libcolord.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
