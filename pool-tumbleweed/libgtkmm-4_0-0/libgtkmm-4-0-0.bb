SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "libgtkmm-4_0-0-4.10.0-2.1.aarch64.rpm"
RPM_HASH = "084164277f1f09cd149ac6ec2b762432c43525824d02f0b9bb6316c79711647aac8528e8342a3af34305987a9c35b816340a76ef0bf3393dffa5a428fd56ed09"

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
