SUMMARY = "A library for playing system sounds"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "gsound-1.0.3-2.8.aarch64.rpm"
RPM_HASH = "24621fd75c878a52e6acdf03ba6aefd2b57b2411dd7b86172dee88aaee0c935dfd2ff115b08764f6ecb250265947ecb3e9c353da81d4c305468c5a5cf4c31770"

RPROVIDES:${PN} += "gsound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0"

inherit rpm
