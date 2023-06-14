SUMMARY = "A virtual pet for your desktop"
DESCRIPTION = "A virtual pet for your desktop that needs your \
care in raising it."
LICENSE = "GPL-3.0-only"

PV = "0.3"

RPM_NAME = "taigo-0.3-1.16.aarch64.rpm"
RPM_HASH = "fcc90fa0d22d97a202470d73df6965e26e4ba4b2050915ef6dde0fdb8e66c978d70633d240d3b550b3fd4d6d4e4019b158ed43573e56b42d7cf477516c675619"

RPROVIDES:${PN} += "taigo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
