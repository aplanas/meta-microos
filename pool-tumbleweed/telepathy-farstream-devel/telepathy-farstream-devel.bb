SUMMARY = "Development files for the Telepathy Call channel handling library"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "telepathy-farstream-devel-0.6.2-2.24.aarch64.rpm"
RPM_HASH = "87695f498172099f07115ba4af621d0133985285abde1a867520e3782a1b705ae6fdfd77d470238219bb53927e4b8cab5f367a02d9835276afb9f3918d63a9ca"

RPROVIDES:${PN} += "pkgconfig-telepathy-farstream \
telepathy-farstream-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtelepathy-farstream3 \
pkgconfig-dbus-glib-1 \
pkgconfig-farstream-0.2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-telepathy-glib \
typelib-1-0-TelepathyFarstream-0-6"

inherit rpm
