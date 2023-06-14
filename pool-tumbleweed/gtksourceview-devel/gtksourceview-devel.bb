SUMMARY = "Development files for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "gtksourceview-devel-3.24.11-3.9.aarch64.rpm"
RPM_HASH = "44f258a7278eb1cf2d7f636e5e50473188d9ed49ee2dd5915770299e2bf88881f9e9e322f1cab6d8d0fc1621eea0e2d4e3aaccc783fec2fbf252e5ad356d0f1c"

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
