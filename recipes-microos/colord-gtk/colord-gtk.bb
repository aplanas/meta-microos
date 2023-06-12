SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "colord-gtk-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "0b94930be8af6477895d537e220533f24148ad3dadfe635e1f89f6cc6d87da322b3813d7b4bd6bfb4043118975b557826d33cff4756fdefe6ec5325352a52658"

RPROVIDES:${PN} += "colord-gtk \
colord-gtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcolord-gtk.so.1()(64bit) \
libcolord.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
