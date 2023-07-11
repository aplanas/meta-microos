SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "libspice-client-gtk-3_0-5-0.42-1.5.aarch64.rpm"
RPM_HASH = "72db3d2d5dbb5e7ca39b4b1cc935f08a260ea27e76f997317b518d164304c502df512f7ee8477dedc1ec9005b1d70df0d80bb3f091a464fd35224e5eb57ac4dd"

RPROVIDES:${PN} += "libspice-client-gtk-3-0-5 \
libspice-client-gtk-3.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libphodav-3.0.so.0 \
libspice-client-glib-2.0.so.8 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
