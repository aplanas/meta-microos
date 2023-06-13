SUMMARY = "Evolution Data Server's Backend Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libebackend-1_2-11-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "94b264c2907af6d3cdd812326701820b816991d14101cb4f605a4f6d3759a902fae2c7c33ee8c36a7a333ca590a2ab8dd99a5af5dd41cf9c8a3759e56ca4e603"

RPROVIDES:${PN} += "libebackend-1.2.so.11()(64bit) \
libebackend-1_2-11 \
libebackend-1_2-11(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcamel-1.2.so.64()(64bit) \
libdb-4.8.so()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedbus-private.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
