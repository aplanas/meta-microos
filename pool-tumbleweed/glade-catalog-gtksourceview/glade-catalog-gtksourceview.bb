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

RPM_NAME = "glade-catalog-gtksourceview-3.24.11-3.9.aarch64.rpm"
RPM_HASH = "c5854ef48624f2c7ac4d87e679ba2a06b05394c7db463da89b53c33632a9ec3c83b473d892caedb33772a5234525459ab70fdd3ce5a3ff841fa23c611eb261f9"

RPROVIDES:${PN} += "glade-catalog-gtksourceview \
glade-catalog-gtksourceview(aarch-64)"

RDEPENDS:${PN} += "glade \
libgtksourceview-3_0-1"

inherit rpm
