SUMMARY = "C language interface for the GEOS library"
DESCRIPTION = "This subpackage contains a shared library providing a C linkage \
interface for the (C++) GEOS library."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "libgeos_c1-3.11.2-2.2.aarch64.rpm"
RPM_HASH = "7c200007cac054895ca89409540fbdb43e8f5717e7d12543c5a31dc93fd5dfe4f073ed8d42aacf234490b494e20b6386e21bb2f10aa77c9cc07a17cf3ae6ca61"

RPROVIDES:${PN} += "libgeos-c.so.1 \
libgeos-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgeos.so.3.11.2 \
libstdc++.so.6"

inherit rpm
