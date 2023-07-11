SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-3-2_2-0-2.2.20-1.13.aarch64.rpm"
RPM_HASH = "c1d7782d9cb500eb5cd34f3a701884e1ab95373a01c34753214f430ba55e145429e12464ae3699286e8656aa2ba2e3c62fa6a5280c825fdb5816446cc6d55675"

RPROVIDES:${PN} += "libcxx-gtk-utils-3-2-2-0 \
libcxx-gtk-utils-3-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
