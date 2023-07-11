SUMMARY = "A GTK+ library to develop UI for mobile devices"
DESCRIPTION = "This package provides the shared library for libhandy, a library to \
help with developing mobile UI using GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "libhandy-1-0-1.8.2-1.4.aarch64.rpm"
RPM_HASH = "894df04daa57bfe4278329eac733cbd0ed3e231ab20c1a1107d667b1e3b746a78cb1791110b4657ab6797ce090e325b664deb0f9fa52df3b0f403a0f953ad996"

RPROVIDES:${PN} += "libhandy \
libhandy-1-0 \
libhandy-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
