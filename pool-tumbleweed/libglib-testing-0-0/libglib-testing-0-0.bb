SUMMARY = "GLib test harness and mocking framework"
DESCRIPTION = "libglib-testing is a test library providing test harnesses and mock \
classes which complement the classes provided by GLib. It is \
intended to be used by any project which uses GLib and which wants \
to write internal unit tests."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libglib-testing-0-0-0.1.1-1.5.aarch64.rpm"
RPM_HASH = "3f89675cdaf3dd829cbb4d9c5e65c873eeb94c9c6832a4284fa0d1bf33c900d28a9a42923b2aaf61c76fa422cbe37192f730db2ed11954ba909ed60922d8231e"

RPROVIDES:${PN} += "libglib-testing-0-0 \
libglib-testing-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
