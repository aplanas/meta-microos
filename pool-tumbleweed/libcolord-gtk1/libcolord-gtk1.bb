SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Library"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libcolord-gtk1-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "329350db6d480ff5fc232a4893bbaa4ce29a9973a9854f09d4ec17b04c1c35a3bf437386b84cf6b1f9cfbe8c7a9a344a5cf64b7d1ea22f7e2a5c5fa4ebdef9df"

RPROVIDES:${PN} += "colord-gtk \
libcolord-gtk.so.1 \
libcolord-gtk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
