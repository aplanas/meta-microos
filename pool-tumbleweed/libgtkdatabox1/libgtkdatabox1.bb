SUMMARY = "GTK+ widget for fast data display"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "libgtkdatabox1-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "affb9af2616d19cc481067bfb1556b77a348e9975f8f31935a87a5e7ac031d96b76f0532b716eafdd657f562363bab7fc6df77db8afab04b1d36fe3ea355c563"

RPROVIDES:${PN} += "libgtkdatabox.so.1 \
libgtkdatabox1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
