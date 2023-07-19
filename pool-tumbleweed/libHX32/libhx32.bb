SUMMARY = "Collection of routines for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more."
LICENSE = "LGPL-2.1-or-later"

PV = "4.14"

RPM_NAME = "libHX32-4.14-1.1.aarch64.rpm"
RPM_HASH = "58054e1022105e0c0eaff003a4822f3ad1fb99d5a835e3908df571ae17526522f5783b4833ce2322b1ac91937de085502d7405321abd0a40e9de741670ebb8a0"

RPROVIDES:${PN} += "libHX.so.32 \
libHX32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
