SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrcares0-8.4-4.2.aarch64.rpm"
RPM_HASH = "6813c4583ebd5d3ddecf9b2fe7d9465004730b855955c907d853cdf957fc502cdad04aa54a920cff692397c6379c9ff9d29c217216d39e979c2b1cbc40ad0a52"

RPROVIDES:${PN} += "libfrrcares.so.0 \
libfrrcares0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcares.so.2"

inherit rpm
