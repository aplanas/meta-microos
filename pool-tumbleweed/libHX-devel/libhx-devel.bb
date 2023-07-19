SUMMARY = "Development for libHX, a routines collection for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more. \
 \
This subpackage contains the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "4.14"

RPM_NAME = "libHX-devel-4.14-1.1.aarch64.rpm"
RPM_HASH = "da50d8b2513f8cee9769adb90768746803ccd88ee0d4e8aa68ffd271054e5b37af6ad49deeb1b44113c63e2762f604b893a5cfe8fd2aa192c880f0b313b9bcee"

RPROVIDES:${PN} += "libHX-devel \
libHX-rtcheck.so \
pkgconfig-libHX"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libHX32"

inherit rpm
