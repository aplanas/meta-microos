SUMMARY = "Collection of routines for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12"

RPM_NAME = "libHX32-4.12-1.2.aarch64.rpm"
RPM_HASH = "f7c1d7bfd7fa5cd970c29b5f5b41f29fb4b8494db0107e20e596af698dcd708595ee1168afe6c9da699e5ba147f210a5dbd0a241a9fc8a3a8f68c765007a488d"

RPROVIDES:${PN} += "libHX.so.32()(64bit) \
libHX.so.32(LIBHX_3.25)(64bit) \
libHX.so.32(LIBHX_3.27)(64bit) \
libHX.so.32(LIBHX_4.11)(64bit) \
libHX.so.32(LIBHX_4.2)(64bit) \
libHX.so.32(LIBHX_4.3)(64bit) \
libHX.so.32(LIBHX_4.9)(64bit) \
libHX32 \
libHX32(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
