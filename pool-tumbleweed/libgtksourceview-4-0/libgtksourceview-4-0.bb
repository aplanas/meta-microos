SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "libgtksourceview-4-0-4.8.4-1.3.aarch64.rpm"
RPM_HASH = "e7331d6c528fcf58c0ba66905c9dd8f3a2f8d3d3dfafa49a53bf463e3735f5b12bf806b56e1fb20969643a7baffa7d8477fc402b09a99b69c7f982b2a897d200"

RPROVIDES:${PN} += "gtksourceview4 \
libgtksourceview-4-0 \
libgtksourceview-4.so.0 \
libgtksourceview4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
