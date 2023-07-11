SUMMARY = "Solitaire Card Games for GNOME"
DESCRIPTION = "Aisleriot is a compilation of 80 different solitaire card games."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.29"

RPM_NAME = "aisleriot-3.22.29-1.2.aarch64.rpm"
RPM_HASH = "ff5bf3a34db80614ff49d3c0ddc0a869d7f7fcef57161936223353ac728cfa1fd8bf1758df6c963f2f5bc84274f8d085b3ac90273c795bc59ddaea115e0a8d24"

RPROVIDES:${PN} += "aisleriot"

RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libguile-3.0.so.1 \
librsvg-2.so.2"

inherit rpm
