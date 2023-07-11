SUMMARY = "Collection of routines for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more."
LICENSE = "LGPL-2.1-or-later"

PV = "4.13"

RPM_NAME = "libHX32-4.13-1.1.aarch64.rpm"
RPM_HASH = "7e9a77a680673afbf13eb45378668d3f9cba7b37cfcdc9d5ba05c24eec529b675b18309814f8da07facb4ad94d599e2516302b68a9670d55ff3caedeccda15a5"

RPROVIDES:${PN} += "libHX.so.32 \
libHX32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
