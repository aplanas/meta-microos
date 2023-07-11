SUMMARY = "Development for libHX, a routines collection for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more. \
 \
This subpackage contains the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "4.13"

RPM_NAME = "libHX-devel-4.13-1.1.aarch64.rpm"
RPM_HASH = "65266b697aa5ee33f35472c402b3aff1e45d1f9c5d0f84582e2ae2273f1d7c31adaaaca3c843811f97e0ae36f45fea762c5649569c5281b5d2faf07e7ab30ba5"

RPROVIDES:${PN} += "libHX-devel \
libHX-rtcheck.so \
pkgconfig-libHX"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libHX32"

inherit rpm
