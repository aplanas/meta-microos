SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-4-2_2-0-2.2.20-1.13.aarch64.rpm"
RPM_HASH = "4dbc7cc632abae56872649a118979cb8d4c954c915e101b86c6c32ea042d141b4871de906d4cc72c35ee03f541a128b4a43b3374d5385a54a30e54d6525af0f7"

RPROVIDES:${PN} += "libcxx-gtk-utils-4-2-2-0 \
libcxx-gtk-utils-4-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
