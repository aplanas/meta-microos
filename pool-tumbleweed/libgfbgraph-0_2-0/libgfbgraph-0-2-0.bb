SUMMARY = "Facebook Graph API access library"
DESCRIPTION = "A GObject library for Facebook Graph API"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "libgfbgraph-0_2-0-0.2.5-1.9.aarch64.rpm"
RPM_HASH = "76b8413829ed1629d65c7f5b1afc6bb5cbd9e7e10a767b4aefdb4eecc3eee214af99bf9558e8276b01d639a33f38a8c480591361ab426db0724a2fd9a9f2e653"

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
