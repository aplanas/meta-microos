SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-2-2_2-0-2.2.20-1.13.aarch64.rpm"
RPM_HASH = "45753781a321656cdb2ba401fae09769915d19ceac53fc6edd58233c7409a1d068976a05ea22032b30049052a41bf1f9774c389a947ea8bb7677931ef0e21ddc"

RPROVIDES:${PN} += "libcxx-gtk-utils-2-2-2-0 \
libcxx-gtk-utils-2-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
