SUMMARY = "Simple GTK+ frontend for MPV"
DESCRIPTION = "Celluloid is a simple GTK+ frontend for MPV."
LICENSE = "GPL-3.0-or-later"

PV = "0.25"

RPM_NAME = "celluloid-0.25-2.1.aarch64.rpm"
RPM_HASH = "70cd0a97dd065a7ad0c050d81c341d01fd97d4c3b21e8dc9e6a504c65a72670219d7bba77a7f0abb0ad96cd9cbff75bd57a8a8e4d4d4cb870e1e9f65c0423964"

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
