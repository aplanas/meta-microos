SUMMARY = "GLib test harness and mocking framework"
DESCRIPTION = "libglib-testing is a test library providing test harnesses and mock \
classes which complement the classes provided by GLib. It is \
intended to be used by any project which uses GLib and which wants \
to write internal unit tests."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libglib-testing-devel-0.1.1-1.4.aarch64.rpm"
RPM_HASH = "c6c2dbe49a380469105d0875419c012ea6bd9ab9a1c9127b85631f0cf5df074be5c6039d14a85eca6f5bb5682c0da8aa5c3b9e605a35ba73fdacf46f768f0558"

RPROVIDES:${PN} += "libglib-testing-devel \
libglib-testing-devel(aarch-64) \
pkgconfig(glib-testing-0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglib-testing-0-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
