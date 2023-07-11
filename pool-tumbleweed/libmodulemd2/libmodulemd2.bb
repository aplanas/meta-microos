SUMMARY = "Main library for libmodulemd"
DESCRIPTION = "This package provides the main library for applications \
that use libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "libmodulemd2-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "81e4b4f2a14cfd869194e0c3a2f5984584d5fb6b5fc93c72948b60f97c246152f5c7abbee339bfdbf3c481c701ca685d15bb583a804b336d8e2d867725a735ad"

RPROVIDES:${PN} += "libmodulemd.so.2 \
libmodulemd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmagic.so.1 \
librpmio.so.9 \
libyaml-0.so.2"

inherit rpm
