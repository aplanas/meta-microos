SUMMARY = "Create shortcuts for LXDE"
DESCRIPTION = "LXShortcut is a small program used to edit application shortcuts \
created with freedesktop.org Desktop Entry spec."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "lxshortcut-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "085521904c809a2f50c7e733a49f2767f63e1aaef5ddc88304a87ecc15ce85555b8fcab67b44ed222fa5d3e1681e4630881b4ff718915d68ae7749bb4c19cdfd"

RPROVIDES:${PN} += "application() \
application(lxshortcut.desktop) \
lxshortcut \
lxshortcut(aarch-64) \
mimehandler(application/x-desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfm-gtk.so.4()(64bit) \
libfm.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
