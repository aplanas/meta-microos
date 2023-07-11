SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-4-devel-2.2.20-1.13.aarch64.rpm"
RPM_HASH = "00ac2a3bf8c7dfb3da06a62c8b4a29003d2bb59ae0500ff830e9acd7883a356456337dc9e18fc478d099a566960223844566d9b184a4465607acbe6afcf89c97"

RPROVIDES:${PN} += "libcxx-gtk-utils-4-devel \
pkgconfig-c++-gtk-utils-4-2.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcxx-gtk-utils-4-2-2-0 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
