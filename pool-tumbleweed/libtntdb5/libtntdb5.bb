SUMMARY = "Library for simple database access"
DESCRIPTION = "Tntdb is a library for simple database access. \
 \
The database independent layer offers easy to use methods for working with the database and also greatly simplifies resource-management. The classes hold reference-counted pointers to the actual implementation. They are copyable and assignable. The user can use the classes just like simple values. The resources they reference are freed, when the last reference is deleted. This happens normally just by leaving the scope. There is normally no reason to instantiate them dynamically on the heap. \
 \
The driver-layer contains the actual implementation, which does the work. These classes are database-dependent. The user normally doesn't need to deal with this."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libtntdb5-1.4-1.13.aarch64.rpm"
RPM_HASH = "c4798372815c386e325c08ae12cd6a329d3c899896caa3c022c0610a5cd7c4046f3fe8ecfeeaafe98f11797e9d8b0d3036bc8cb22dac3d5749950fe724d80d09"

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
