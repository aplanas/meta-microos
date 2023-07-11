SUMMARY = "GObject-based library providing commonly used data structures"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures."
LICENSE = "LGPL-2.1+"

PV = "0.6.6"

RPM_NAME = "libgee2-0.6.6-5.29.aarch64.rpm"
RPM_HASH = "78b0742ac52732320ac49505d56d6d64891c4683aecf562351eb9a95b176e0e32ecc3458d6fe35d38ed83d86c5103ecdf8f10ba2ab421795692576c296e8bb96"

RPROVIDES:${PN} += "libgee.so.2 \
libgee2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
