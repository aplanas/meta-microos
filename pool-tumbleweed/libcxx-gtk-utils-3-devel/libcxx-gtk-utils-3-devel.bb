SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-3-devel-2.2.20-1.12.aarch64.rpm"
RPM_HASH = "81816617bea90ff9f432e9ca65b17e39c7b335c77991a979bea1441e5888b3579ad45c1ac9398b6564d0f6a653b543b9ce625ef86e941a39289cd74892be8e32"

RPROVIDES:${PN} += "libcxx-gtk-utils-3-devel \
libcxx-gtk-utils-3-devel(aarch-64) \
pkgconfig(c++-gtk-utils-3-2.2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcxx-gtk-utils-3-2_2-0 \
pkgconfig(glib-2.0) \
pkgconfig(gthread-2.0)"

inherit rpm
