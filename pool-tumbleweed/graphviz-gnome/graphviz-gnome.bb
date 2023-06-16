SUMMARY = "Graphviz plugins that use gtk/GNOME"
DESCRIPTION = "Graphviz plugins that use gtk/GNOME."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gnome-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "5370c5635f6b8741291c6156f4969ee54206b0d8ba22ee6d8c8ef45eb2cc785f0c512011c3bf6bb2d24f90cda5f9f8795294b8aeae7483073f2b781d1f488e5b"

RPROVIDES:${PN} += "graphviz-gnome \
libgvplugin-gdk.so.6 \
libgvplugin-gs.so.6 \
libgvplugin-gtk.so.6 \
libgvplugin-pango.so.6 \
libgvplugin-rsvg.so.6 \
libgvplugin-xlib.so.6"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcgraph.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgs.so.9 \
libgtk-x11-2.0.so.0 \
libgvc.so.6 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
