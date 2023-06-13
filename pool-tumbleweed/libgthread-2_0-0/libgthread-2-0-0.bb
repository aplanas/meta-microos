SUMMARY = "Portable API from glib wrapping system threads"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgthread library provides a portable way to write multi-threaded \
software."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "libgthread-2_0-0-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "2133ffbb12fe5cfc619ce759a6a850a9fc148e628c85bf85fdf7abfa7e702cbddc574af62a42e5cafcdcd1a4480b8d6ef4e0af9f17de0d305c8c3c54bdc334b6"

RPROVIDES:${PN} += "libgthread-2.0.so.0()(64bit) \
libgthread-2_0-0 \
libgthread-2_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0()(64bit)"

inherit rpm
