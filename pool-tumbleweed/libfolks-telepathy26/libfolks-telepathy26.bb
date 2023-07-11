SUMMARY = "Telepathy backend for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "libfolks-telepathy26-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "0ea49e52af5f1d745d0d1274271e71ee89abdfb4b4bec7eaddac5a7c0360b8b4c4b980967c6698c0c6914264da302cbad23590c7a491c61e59b9a80d27833cfa"

RPROVIDES:${PN} += "libfolks-telepathy.so.26 \
libfolks-telepathy26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
