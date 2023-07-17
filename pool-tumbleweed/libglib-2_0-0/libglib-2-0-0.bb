SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "libglib-2_0-0-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "a9151e3134c8eae2719406562147ee2b1adc4231edf5b895c5d925f2ce460e7e95de3b4828400bb228b6efec2141d47e24fd322c31c59130c237492070f0ea1c"

RPROVIDES:${PN} += "glib2 \
libglib-2-0-0 \
libglib-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
