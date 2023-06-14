SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-4-2_2-0-2.2.20-1.12.aarch64.rpm"
RPM_HASH = "4036f13220f3cf4f7b6a28d44763c8a853628716870314375df2705a3f2d8990a9244ebd5e6ee623730c5209eda5d3762bd76a68081e4c0bc5224bf37e08cb33"

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
