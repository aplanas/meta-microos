SUMMARY = "GObject-based Plugin Engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-gtk-1_0-0-1.36.0-1.1.aarch64.rpm"
RPM_HASH = "8e3a13e99cb8dc96facab550cb9d03cec32f8c484b9b1c32e96ba7d8e5c1d8605b7c8adfd7cecd7626df3569b6cf7ab0eec3e15d2300b1c1dbd3a7f82cc47cbb"

RPROVIDES:${PN} += "libpeas-gtk-1-0-0 \
libpeas-gtk-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
