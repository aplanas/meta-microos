SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "gtksourceview5-devel-5.8.0-1.2.aarch64.rpm"
RPM_HASH = "837f88bcb2622b7a50ef2383ac24f4592d611b17b57dace460944fa30bd5bb8d1e1e5d0a08308a8688374be48341ca2b2dada442a79d78c827060e7194c76b7a"

RPROVIDES:${PN} += "gtksourceview5-devel \
pkgconfig-gtksourceview-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-5-0 \
pkgconfig-fontconfig \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-libpcre2-8 \
pkgconfig-libxml-2.0 \
pkgconfig-pangoft2 \
typelib-1-0-GtkSource-5"

inherit rpm
