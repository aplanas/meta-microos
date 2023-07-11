SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-2-devel-2.2.20-1.13.aarch64.rpm"
RPM_HASH = "57f8a0869d3cb99c8c012fdd4e5c3a345115c7f6e13d2426a811d52bce2a9a92b3c776002dede9e7594bcea515719175839d86c18058721b1ae85c48487e6274"

RPROVIDES:${PN} += "libcxx-gtk-utils-2-devel \
pkgconfig-c++-gtk-utils-2-2.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcxx-gtk-utils-2-2-2-0 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
