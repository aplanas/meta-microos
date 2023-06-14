SUMMARY = "Facebook Graph API access library"
DESCRIPTION = "A GObject library for Facebook Graph API"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "libgfbgraph-0_2-0-0.2.5-1.8.aarch64.rpm"
RPM_HASH = "258084e6f49462e5472ab8a7a6fd7fadb9025b174332097281ae139c04541c4d7fa0293f90fc73bc4cd2af69482e43c5d25e15cab24317e48c9abc5eeed0df98"

RPROVIDES:${PN} += "libgfbgraph-0-2-0 \
libgfbgraph-0.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
librest-0.7.so.0 \
libsoup-2.4.so.1"

inherit rpm
