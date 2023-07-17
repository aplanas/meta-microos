SUMMARY = "Portable API from glib wrapping system threads"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgthread library provides a portable way to write multi-threaded \
software."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "libgthread-2_0-0-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "74e2750d1e5f9fc82919401b864d359ec2987db359d8a3d285fb792afcb5962b0a7dfe0e68a84069af1ec4cdc54d68900b21c06fc63e9e3190ec5fa66ab44f09"

RPROVIDES:${PN} += "libgthread-2-0-0 \
libgthread-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0"

inherit rpm
