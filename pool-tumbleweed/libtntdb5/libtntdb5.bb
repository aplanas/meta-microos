SUMMARY = "Library for simple database access"
DESCRIPTION = "Tntdb is a library for simple database access. \
 \
The database independent layer offers easy to use methods for working with the database and also greatly simplifies resource-management. The classes hold reference-counted pointers to the actual implementation. They are copyable and assignable. The user can use the classes just like simple values. The resources they reference are freed, when the last reference is deleted. This happens normally just by leaving the scope. There is normally no reason to instantiate them dynamically on the heap. \
 \
The driver-layer contains the actual implementation, which does the work. These classes are database-dependent. The user normally doesn't need to deal with this."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libtntdb5-1.4-1.12.aarch64.rpm"
RPM_HASH = "a248bb45fd0c547b50c767f24922f53c05075f065500ad6dbf18ffc014b1ce3966f8fdda3d96b351c07cc0dbc21ac05bae7f88819931c9f116b45d381286390f"

RPROVIDES:${PN} += "libtntdb.so.5 \
libtntdb5 \
tntdb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
