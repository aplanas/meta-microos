SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.5"

RPM_NAME = "libgtksourceview-2_0-0-2.10.5-20.9.aarch64.rpm"
RPM_HASH = "718a36ccd6d340039648d614b5484c5e817ee93bf19162efbbde192b7277a1ebd44e2d35944c509727c21a7a18490d8c0d6965ab93a0dd2550cc85c87bb7599a"

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
