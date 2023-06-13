SUMMARY = "Minimalistic Netlink communication library"
DESCRIPTION = "libmnl is a minimalistic user-space library oriented to Netlink \
developers. There are a lot of common tasks in parsing, validating, \
constructing of both the Netlink header and TLVs that are repetitive \
and easy to get wrong. This library aims to provide simple helpers \
that allows you to re-use code and to avoid re-inventing the wheel."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libmnl0-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "c03913e41085939283cc0e664da391b99a2f8c188c626ee52f231d99358848ea1de35a04e7a86537437d7964a8d752516fcb18762f98cf7f8b1c372067a8b94c"

RPROVIDES:${PN} += "libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit) \
libmnl.so.0(LIBMNL_1.1)(64bit) \
libmnl.so.0(LIBMNL_1.2)(64bit) \
libmnl0 \
libmnl0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
