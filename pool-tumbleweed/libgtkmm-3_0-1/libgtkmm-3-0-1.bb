SUMMARY = "C++ Interface for GTK3 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.7"

RPM_NAME = "libgtkmm-3_0-1-3.24.7-2.3.aarch64.rpm"
RPM_HASH = "72d6b17816299e35605af2821beb6e8c2822cbfbb3b608b6a4aabb51f2fdf28b7f25f361947d48740e7f58358c404d7dfb85b225bd5e1d75b5df29db1eb60cd8"

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
