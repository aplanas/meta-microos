SUMMARY = "Documentation for GTKDataBox"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "gtkdatabox-gtk-doc-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "a9d90efd3d6136a107ab35e4fcf97449db94ca14612dc05ec71345b65dd347acafe571b2fc2965c06d194e693e09cca7445001b6a372d105767acd2c511cadbd"

RPROVIDES:${PN} += "gtkdatabox-gtk-doc \
gtkdatabox-gtk-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
