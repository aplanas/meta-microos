SUMMARY = "Simple GTK+ frontend for MPV"
DESCRIPTION = "Celluloid is a simple GTK+ frontend for MPV."
LICENSE = "GPL-3.0-or-later"

PV = "0.25"

RPM_NAME = "celluloid-0.25-1.1.aarch64.rpm"
RPM_HASH = "2ea70a5a11c82aff9876b1289b3626fe75e28f693054c24fe94dac67be8c7b3992871ef89182daa43fdb198ec1b71691bea695d8033ceae5e5035ba49df556e9"

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
