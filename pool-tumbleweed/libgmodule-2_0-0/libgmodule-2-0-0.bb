SUMMARY = "General-Purpose Utility Library -- Library for Modules"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgmodule library provides a portable way to dynamically load \
object files (commonly known as 'plug-ins')."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "libgmodule-2_0-0-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "e7bc165f11084be8ded233da41ed2bb83d59c7aab14681031ea8e40179c0c115ddb1efc00386276a4ad4c3ad6e9908fb9ef7a646c7bb718e05588c8a1fa058ef"

RPROVIDES:${PN} += "libgmodule-2-0-0 \
libgmodule-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
