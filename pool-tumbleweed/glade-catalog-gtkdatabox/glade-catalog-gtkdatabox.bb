SUMMARY = "Glade catalog for GTKDataBox"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "glade-catalog-gtkdatabox-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "9173a14afafe29ee6d9cdeae94f8a6360a71f3e727eb59a552c15405d66d0aacab9721f1123b6122e5498dfad8ec302dd0fb6db689b9e46c24b0dfb3dd243e37"

RPROVIDES:${PN} += "glade-catalog-gtkdatabox \
libgladedatabox.so"

RDEPENDS:${PN} += "libgladeui-2.so.13 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkdatabox.so.1"

inherit rpm
