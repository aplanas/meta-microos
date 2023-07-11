SUMMARY = "Glade catalog for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides a catalog for Glade, to allow the use the \
GtkSourceView widget in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "glade-catalog-gtksourceview-3.24.11-3.10.aarch64.rpm"
RPM_HASH = "cbf8374c96e2381826c38d49be747d96f63a4317d33ccd1a6a65e3fab6ccb45883f5ff78fcd8c9e71448c62d9bde7bc40b5e889d886a049ab0814e068002b874"

RPROVIDES:${PN} += "glade-catalog-gtksourceview"

RDEPENDS:${PN} += "glade \
libgtksourceview-3-0-1"

inherit rpm
