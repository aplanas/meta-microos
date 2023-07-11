SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "gtksourceview4-devel-4.8.4-1.4.aarch64.rpm"
RPM_HASH = "3f96062f02b0d2b0b35086062c421efb0e1af2f90eaacc387d3e1c8f5cff0cce7fa86dc330a5ea7c8fd954b1b4ce9f518140dd7aff3834ce49aaa480381e3702"

RPROVIDES:${PN} += "gtksourceview4-devel \
pkgconfig-gtksourceview-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-4-0 \
libgtksourceview4 \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GtkSource-4"

inherit rpm
