SUMMARY = "Portable API from glib wrapping system threads"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgthread library provides a portable way to write multi-threaded \
software."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "libgthread-2_0-0-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "21e42727f513dd893e43053f466ef5d8f472f722a0282e0566f5286ccd2c7648b0bd81f56fc277723fc266d45b8bf778570bd6a6f9b85fb1f19c0083dab46139"

RPROVIDES:${PN} += "libgthread-2-0-0 \
libgthread-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0"

inherit rpm
