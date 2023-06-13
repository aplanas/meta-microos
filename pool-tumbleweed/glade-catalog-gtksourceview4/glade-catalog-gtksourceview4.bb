SUMMARY = "GTK+ Source Editing Widget -- Catalog for Glade"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides a catalog for Glade, to allow the use the \
GtkSourceView widget in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "glade-catalog-gtksourceview4-4.8.4-1.3.aarch64.rpm"
RPM_HASH = "11d4c6a093f0d81cde6fb1694b5b6f94279871fa3d88f6527fc868edfb44e2692a6979d52705f84f922abac3485720835a89f52098664d43b94fce73bed56af7"

RPROVIDES:${PN} += "glade-catalog-gtksourceview \
glade-catalog-gtksourceview4 \
glade-catalog-gtksourceview4(aarch-64)"

RDEPENDS:${PN} += "glade \
libgtksourceview-4-0"

inherit rpm
