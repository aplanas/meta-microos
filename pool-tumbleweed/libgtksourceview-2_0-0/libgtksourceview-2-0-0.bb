SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.5"

RPM_NAME = "libgtksourceview-2_0-0-2.10.5-20.10.aarch64.rpm"
RPM_HASH = "c796b57036a2a3ed6f7e446b6364233e929a83bcb11715d501d2f30b65be5802e805d75808df283132bdddca5beaeabf4a49c93868a33c7103d8ad5774901f2b"

RPROVIDES:${PN} += "gtksourceview2 \
libgtksourceview-2-0-0 \
libgtksourceview-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
