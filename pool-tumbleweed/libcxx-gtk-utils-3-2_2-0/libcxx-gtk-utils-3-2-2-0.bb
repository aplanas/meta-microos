SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-3-2_2-0-2.2.20-1.12.aarch64.rpm"
RPM_HASH = "e77759777ddc4129ec306127363aedecada0f0c01964c47e448c528d85eb1268697467c2e148bfab1daf9537645b4b9ee65413e85210c87f1104511dab2f3633"

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
