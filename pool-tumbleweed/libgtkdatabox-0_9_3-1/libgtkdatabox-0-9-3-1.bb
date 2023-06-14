SUMMARY = "GTK+ widget for fast data display"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-2 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1+"

PV = "0.9.3.1"

RPM_NAME = "libgtkdatabox-0_9_3-1-0.9.3.1-1.9.aarch64.rpm"
RPM_HASH = "8119eaa836267b65bcff12af12858513a85f73899870fed20f08909738608370a4ed143d1b984c479986ed4fff210d34308c83a4d84e633c595409e6bde1fe1e"

RPROVIDES:${PN} += "libgtkdatabox \
libgtkdatabox-0-9-3-1 \
libgtkdatabox-0.9.3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
