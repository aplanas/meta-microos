SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Library"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libcolord-gtk4-1-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "33afa49c133b78b7336cab1d4594181eee80a60aafa22c9ba8e6acac08697db0f9ba67603bd87f5271eaa2dd80658a0138e7209bd08e2b45541f1b15e77e071e"

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
