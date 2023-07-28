SUMMARY = "Webcam Booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "cheese-44.1-1.1.aarch64.rpm"
RPM_HASH = "d4072d840e47cfae8b7bdba4971e35a8e6f417bec08bf3db2e1ae5d3045f4d9540fce8226ae2b9cb1cc64e1fe120c1949399e2b238d24d05f8459f9bdd4173bb"

RPROVIDES:${PN} += "cheese"

RDEPENDS:${PN} += "gnome-video-effects \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcheese-gtk.so.25 \
libcheese.so.8 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
