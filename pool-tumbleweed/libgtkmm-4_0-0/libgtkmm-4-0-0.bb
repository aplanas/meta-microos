SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "libgtkmm-4_0-0-4.10.0-1.1.aarch64.rpm"
RPM_HASH = "5fa257a49be6c6233d7ce80162749374b6bbb43ec70aa3840cc77ad3ea84affd02ec17a3da19ca608e946095e0d293d8ba09f48cd3aa2ca9ac300e6a21205dc1"

RPROVIDES:${PN} += "libgtkmm-4-0-0 \
libgtkmm-4.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairomm-1.16.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libpangomm-2.48.so.1 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
