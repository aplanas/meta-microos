SUMMARY = "Evolution Data Server backend for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "libfolks-eds26-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "1536e6b7feaf2351036c174edeabf1381daa7911b70d2d2a73282e17d5ac03af3c97ae9cb15622c1aa04fbc1924bc7fe3754602dd89afc33743d8bb2e21414af"

RPROVIDES:${PN} += "libfolks-eds.so.26()(64bit) \
libfolks-eds26 \
libfolks-eds26(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libebook-1.2.so.21()(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
