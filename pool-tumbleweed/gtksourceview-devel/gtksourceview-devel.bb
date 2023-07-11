SUMMARY = "Development files for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "gtksourceview-devel-3.24.11-3.10.aarch64.rpm"
RPM_HASH = "73e76032bcaf39a507f0673e33cbaedff2ca2c9e8904c595b3c32b8ec1eaf798a53dd30089d26bb5d5aa73ff82182219c7e08dae5e8e52a59de9dc3b3520148c"

RPROVIDES:${PN} += "gtksourceview-devel \
pkgconfig-gtksourceview-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-3-0-1 \
libgtksourceview3 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GtkSource-3-0"

inherit rpm
