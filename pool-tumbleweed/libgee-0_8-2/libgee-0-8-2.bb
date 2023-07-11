SUMMARY = "GObject-based library providing commonly used data structures"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides Libgee's shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.6"

RPM_NAME = "libgee-0_8-2-0.20.6-1.4.aarch64.rpm"
RPM_HASH = "8761040130bebc2f805b73e82b318d790a7c351a9f82e68db49a24ae9a484eb1de2d5561c265874461c8621028725b208e499b3efcee150f734a136f659d8b1f"

RPROVIDES:${PN} += "libgee-0-8-2 \
libgee-0.8.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
