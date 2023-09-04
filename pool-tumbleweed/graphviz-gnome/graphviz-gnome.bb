SUMMARY = "Graphviz plugins that use gtk/GNOME"
DESCRIPTION = "Graphviz plugins that use gtk/GNOME."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gnome-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "04fcfccbc480b9d735f1799e7e2927d70820998ed213101c33c7913e1cb24107a166bad6b1e4e1aed55c10a39229ab3ff31f3be6beb13fcbdfef44f21bb29e1a"

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
