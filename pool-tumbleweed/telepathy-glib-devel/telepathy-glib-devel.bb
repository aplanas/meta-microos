SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Development Files"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "telepathy-glib-devel-0.24.2-1.11.aarch64.rpm"
RPM_HASH = "c73734a7994170a74fddf84941aefb5d63d05e3e3ed04f9796334df37543cf4a92e522be31e48317c9b17104b88b652eed85180edd262cb5a2a3d50d71faeb0e"

RPROVIDES:${PN} += "pkgconfig-telepathy-glib \
telepathy-glib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtelepathy-glib0 \
pkgconfig-dbus-1 \
pkgconfig-dbus-glib-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-TelepathyGlib-0-12"

inherit rpm
