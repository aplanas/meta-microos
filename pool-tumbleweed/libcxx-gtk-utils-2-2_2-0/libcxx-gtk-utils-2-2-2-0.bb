SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-2-2_2-0-2.2.20-1.12.aarch64.rpm"
RPM_HASH = "d4b3e8afc0778c6b804f5829624f09291b5adc165e7f0f5f80ac62e1d3a4b9748724f02ae6229ca908ab7bed0d4b16c0eff666f6f00796bd7581484c55e55e72"

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
