SUMMARY = "Evolution Data Server backend for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "libfolks-eds26-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "1536e6b7feaf2351036c174edeabf1381daa7911b70d2d2a73282e17d5ac03af3c97ae9cb15622c1aa04fbc1924bc7fe3754602dd89afc33743d8bb2e21414af"

RPROVIDES:${PN} += "libfolks-eds.so.26 \
libfolks-eds26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.4 \
libedataserver-1.2.so.27 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
