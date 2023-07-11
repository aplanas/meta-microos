SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgexiv2-2-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "c97a51e85ebbaed866b12a0df4876db6e6daa96749ccf96c3cbe54e204a904423f2670d497534fa13ff01bd7b128303a7f470813c4bec8e05376f6890200ddf4"

RPROVIDES:${PN} += "libgexiv2-2 \
libgexiv2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
