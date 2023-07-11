SUMMARY = "C++ Interface for GTK3 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.7"

RPM_NAME = "libgtkmm-3_0-1-3.24.7-2.4.aarch64.rpm"
RPM_HASH = "7b2b1e453a8f925c51a2b14df801913d34d767ff6de739a6b34a2b60b69d1e45d96e510ec79bfaed8ccd4f2c5901e1d689ea503b2a808a0bea5933319ba57c89"

RPROVIDES:${PN} += "libgdkmm-3.0.so.1 \
libgtkmm-3-0-1 \
libgtkmm-3.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
