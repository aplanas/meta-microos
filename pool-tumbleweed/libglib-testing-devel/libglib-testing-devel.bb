SUMMARY = "GLib test harness and mocking framework"
DESCRIPTION = "libglib-testing is a test library providing test harnesses and mock \
classes which complement the classes provided by GLib. It is \
intended to be used by any project which uses GLib and which wants \
to write internal unit tests."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libglib-testing-devel-0.1.1-1.5.aarch64.rpm"
RPM_HASH = "7097fec73e368a38cc9782735ed62c70848fa112d9ffa921042c2db0a56b2769258b6c5c307f9f7bdd30084ebd648e520d3d0b2986f72a139067d4f11e9d6230"

RPROVIDES:${PN} += "libglib-testing-devel \
pkgconfig-glib-testing-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglib-testing-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
