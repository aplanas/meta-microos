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

RPM_NAME = "glade-catalog-gtksourceview4-4.8.4-1.4.aarch64.rpm"
RPM_HASH = "266c6918fe9596592b87af10bdc45bef9d419f53f2274c7a575ab11a01877eaf324267631af36819a5ef584ddb434dc17a83bee7f21d1f39418652e8ded775dc"

RPROVIDES:${PN} += "glade-catalog-gtksourceview \
glade-catalog-gtksourceview4"

RDEPENDS:${PN} += "glade \
libgtksourceview-4-0"

inherit rpm
