SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Library"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libcolord-gtk1-0.3.0-2.1.aarch64.rpm"
RPM_HASH = "05d7afab04203bc4df96ae8fb439ee23a6efb0d987a05322c51061c44451247183422545b8e9eb80d9a61e20ce4dafddfdac679c17347ef33e97b378ab1ec677"

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
