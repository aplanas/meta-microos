SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "libgtkmm-4_0-0-4.10.0-1.2.aarch64.rpm"
RPM_HASH = "af1fab39ac52787c5cc844f5d2f2f55884560d93df47d81159370edd121d57da692c1fbf2accde2a537fa3484b16191d0642b83a4ba0e4595e4d4ac4704c636b"

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
