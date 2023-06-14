SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgexiv2-2-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "258ef88d1dc586eae801bdc273cd01fa0c7658e56b45164dc69b3de027001eb60d45f2c4dc9e6f82190de2e187ec000671ff6f519706ab06e46a3640296dbc99"

RPROVIDES:${PN} += "libgexiv2-2 \
libgexiv2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.27 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
