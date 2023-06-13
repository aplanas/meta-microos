SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "gtksourceview5-devel-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "56abcbebecc8a61eda70588e9390cf9dc94da1b9907feaa8947e3a80cce16166f2c24242f2825baecd2884c5f6edb7ae72515397165f4355e5253661e9e89c85"

RPROVIDES:${PN} += "gtksourceview5-devel \
gtksourceview5-devel(aarch-64) \
pkgconfig(gtksourceview-5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-5-0 \
pkgconfig(fontconfig) \
pkgconfig(fribidi) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk4) \
pkgconfig(libpcre2-8) \
pkgconfig(libxml-2.0) \
pkgconfig(pangoft2) \
typelib-1_0-GtkSource-5"

inherit rpm
