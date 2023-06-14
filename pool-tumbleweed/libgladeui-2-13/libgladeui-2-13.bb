SUMMARY = "Core library of the GLADE User Interface Builder"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "libgladeui-2-13-3.40.0-2.3.aarch64.rpm"
RPM_HASH = "5c37c1f14c055a29bb1c8955502faf8235b13fa8b0593be064578fbd89fa2e9a6a8d2fab000630a079c6fc11c16e7fcbd0868fbee15aa88928cbfe8de003aff8"

RPROVIDES:${PN} += "libgladeui-2-13 \
libgladeui-2.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
