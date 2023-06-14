SUMMARY = "User Interface Builder for GTK+ 3"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-3.40.0-2.3.aarch64.rpm"
RPM_HASH = "04876c8496a96589f907bec1d15c1a7e5ef350d32704a399067a319f5bbb03a9a68a69e64601ed90d79e1ab3e6bd3e5ba8e198d682b045d30a8a2da920021e67"

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
libpython3.10.so.1.0"

inherit rpm
