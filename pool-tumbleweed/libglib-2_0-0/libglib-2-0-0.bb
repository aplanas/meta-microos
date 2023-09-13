SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "libglib-2_0-0-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "9f66a45ae2b8e61d6cf36f0516edc3b02a70f2d9bd21af8907723c88a02a09fe8dca171cb9cfc838f9e4108e8e1825ce11936ac3cb43ba8d30c12b0ab3d83ad1"

RPROVIDES:${PN} += "glib2 \
libglib-2-0-0 \
libglib-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
