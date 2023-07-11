SUMMARY = "Evolution Data Server's Backend Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "libebackend-1_2-11-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "3b0d10faa4095ac1173d2526da25be2e82ef5809ea67af75b25b2c135d808e7d3f71ffef9624d6870f620502982197a65c2fda5b20df74c67e30b3b367a1a5f0"

RPROVIDES:${PN} += "libebackend-1-2-11 \
libebackend-1.2.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libdb-4.8.so \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
