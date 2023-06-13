SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Library"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libcolord-gtk1-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "329350db6d480ff5fc232a4893bbaa4ce29a9973a9854f09d4ec17b04c1c35a3bf437386b84cf6b1f9cfbe8c7a9a344a5cf64b7d1ea22f7e2a5c5fa4ebdef9df"

RPROVIDES:${PN} += "colord-gtk \
libcolord-gtk.so.1()(64bit) \
libcolord-gtk1 \
libcolord-gtk1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcolord.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
