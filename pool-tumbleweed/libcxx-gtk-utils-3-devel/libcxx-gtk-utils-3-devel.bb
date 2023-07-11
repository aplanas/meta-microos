SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-3-devel-2.2.20-1.13.aarch64.rpm"
RPM_HASH = "f20b2f7abea965476d730a6d4be96ad2f6052613ea0f4d26315ebd7282e995ac34e878b06d3e9049e677e4f5b5a51d6653df4bf2b266afcaf6a34150d09c0354"

RPROVIDES:${PN} += "libcxx-gtk-utils-3-devel \
pkgconfig-c++-gtk-utils-3-2.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcxx-gtk-utils-3-2-2-0 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
