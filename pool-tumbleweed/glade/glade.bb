SUMMARY = "User Interface Builder for GTK+ 3"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-3.40.0-2.4.aarch64.rpm"
RPM_HASH = "c5d34ba183e546ec4d8a1bd578b13c9554c48624200fa70c6041eaf4c6b75d4796fc64ddbf5bb36ac9e2909f4e9b011dbc1785fbf8106f7d36c3add5e4e4f9ed"

RPROVIDES:${PN} += "glade \
libgladegjs.so \
libgladegtk.so \
libgladepython.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgjs.so.0 \
libgladeui-2.so.13 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpython3.11.so.1.0"

inherit rpm
