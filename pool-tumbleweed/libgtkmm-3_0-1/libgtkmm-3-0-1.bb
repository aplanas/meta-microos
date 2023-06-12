SUMMARY = "C++ Interface for GTK3 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.7"

RPM_NAME = "libgtkmm-3_0-1-3.24.7-2.3.aarch64.rpm"
RPM_HASH = "72d6b17816299e35605af2821beb6e8c2822cbfbb3b608b6a4aabb51f2fdf28b7f25f361947d48740e7f58358c404d7dfb85b225bd5e1d75b5df29db1eb60cd8"

RPROVIDES:${PN} += "libgdkmm-3.0.so.1()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libgtkmm-3_0-1 \
libgtkmm-3_0-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
