SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrcares0-8.4-5.1.aarch64.rpm"
RPM_HASH = "7e0ca3e9ee01f527814ed03d786472c82828a136afccb6100a52143c9f19ff094b80f95a2ade6860757026c9dc4fa10294d8c76cf30c545f31912f60d6ecfe10"

RPROVIDES:${PN} += "libfrrcares.so.0 \
libfrrcares0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcares.so.2"

inherit rpm
