SUMMARY = "NUMA Policy Control"
DESCRIPTION = "Control NUMA policy for individual processes. Offer libnuma for \
individual NUMA policy in applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.16.21.g693fee1"

RPM_NAME = "libnuma1-2.0.16.21.g693fee1-1.1.aarch64.rpm"
RPM_HASH = "df21dd12416e3f0a134517acda46c4fd4f01f68f51b087bc1e7176be5391bb9acd8c2d1edeb9788ffbc5e15dd2a43a98a78002df67029095447ebf9a4940ae56"

RPROVIDES:${PN} += "libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit) \
libnuma.so.1(libnuma_1.3)(64bit) \
libnuma.so.1(libnuma_1.4)(64bit) \
libnuma.so.1(libnuma_1.5)(64bit) \
libnuma.so.1(libnuma_1.6)(64bit) \
libnuma1 \
libnuma1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
