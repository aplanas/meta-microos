SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "spice-gtk-0.42-2.1.aarch64.rpm"
RPM_HASH = "9cc8c2af130906704b9a004f000ad43a321ac2e73014854fa0bf6cf9618fe49d347781f3272b35e89f95af50457f1acd2c49bc754dd4a9cde902077a4afd5898"

RPROVIDES:${PN} += "spice-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libwayland-server.so.0 \
permissions"

inherit rpm
