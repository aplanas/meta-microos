SUMMARY = "GObject-based library for the Telepathy D-Bus API"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "libtelepathy-glib0-0.24.2-1.11.aarch64.rpm"
RPM_HASH = "8527cc79ad697cf21e6fde8d3e168b8190c70a7fe0dfcbf8d0be89c2b7a86279205d03ce4be3b3e559b990d9907ed64d61394d7d26295f4b4db5d5b041c9951f"

RPROVIDES:${PN} += "libtelepathy-glib.so.0 \
libtelepathy-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
