SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "libgtksourceview-5-0-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "e6f42d702c159ec0ff3c9f0bdd7898ea80d2df92db443419870ee9e4df76f821f84f79666ef46e7d938af95f84f55489ef42c762c6680d7cf37a9f86a794a2f5"

RPROVIDES:${PN} += "gtksourceview5 \
libgtksourceview-5-0 \
libgtksourceview-5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpcre2-8.so.0 \
libxml2.so.2"

inherit rpm
