SUMMARY = "Simple GTK+ frontend for MPV"
DESCRIPTION = "Celluloid is a simple GTK+ frontend for MPV."
LICENSE = "GPL-3.0-or-later"

PV = "0.25"

RPM_NAME = "celluloid-0.25-1.2.aarch64.rpm"
RPM_HASH = "652955119271b4f8c7f50dff099407a6f4274bbc3b26907a757880ae9cc8076844cebafca6f8f16c8ee2eb629e83bfe4e63a7e38b033bfdb6af23481726cb411"

RPROVIDES:${PN} += "celluloid \
gnome-mpv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libepoxy.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libmpv.so.2 \
libpango-1.0.so.0"

inherit rpm
