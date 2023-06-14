SUMMARY = "Libfm libraries"
DESCRIPTION = "libfm main library"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm4-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "5431fc959a2cba1c5da9affaad7609d0c3bc14563d731b2091ed2c36db68709325c422503e9738c3cc493a893af53acd0fce69b77284041c4f370555539b38b8"

RPROVIDES:${PN} += "libfm.so.4 \
libfm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libexif.so.12 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmenu-cache.so.3"

inherit rpm
