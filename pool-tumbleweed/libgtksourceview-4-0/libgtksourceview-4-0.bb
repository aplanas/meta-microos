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
libgtksourceview-4-0(aarch-64) \
libgtksourceview-4.so.0()(64bit) \
libgtksourceview4"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libfribidi.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.6)(64bit)"

inherit rpm
