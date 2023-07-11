SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "libgtksourceview-5-0-5.8.0-1.2.aarch64.rpm"
RPM_HASH = "714976fe09fabe511ba15c4aa68756ed589194065fa1f5664aca908747397bbf6d2f6dd8b28a986d99f67f462a7f3d14449a2da121f4f906a9ddc1c75cd918d4"

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
