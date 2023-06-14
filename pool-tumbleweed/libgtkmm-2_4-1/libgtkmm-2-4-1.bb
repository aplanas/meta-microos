SUMMARY = "C++ Interface for GTK2 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm2 wraps \
GTK+ 2. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.5"

RPM_NAME = "libgtkmm-2_4-1-2.24.5-4.3.aarch64.rpm"
RPM_HASH = "9204b1a9a64534a76ec315c3b30e3705344829d6a4826eb057fd6098176ff335c44b815be179f04dc66dd9b38c1355bdf491374d1e74ca1eca076eeceff5c9df"

RPROVIDES:${PN} += "gtkmm2 \
gtkmm24 \
libgdkmm-2.4.so.1 \
libgtkmm-2-4-1 \
libgtkmm-2.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
