SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Development Files"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "telepathy-glib-devel-0.24.2-1.10.aarch64.rpm"
RPM_HASH = "3e7c0dee1022af764f77789f600eeef3cf666871046a1ae063d900134781296c1a2556a6567e0b10241204d7c05139f42df459806097e7069b845cd7f2d1f15b"

RPROVIDES:${PN} += "pkgconfig(telepathy-glib) \
telepathy-glib-devel \
telepathy-glib-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtelepathy-glib0 \
pkgconfig(dbus-1) \
pkgconfig(dbus-glib-1) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
typelib-1_0-TelepathyGlib-0_12"

inherit rpm
