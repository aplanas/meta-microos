SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr0-8.4-4.1.aarch64.rpm"
RPM_HASH = "f6da0d22bbdbc3e02eaf3aabcf090fa7041a7fe2a7c29c1a385071bb4bcc752d8d83019e68e264366506d6e25f9f81e4cbedbba2cf56af669ddead1f424e4e9d"

RPROVIDES:${PN} += "libfrr.so.0 \
libfrr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libjson-c.so.5 \
libm.so.6 \
libsqlite3.so.0 \
libunwind.so.8 \
libyang.so.2"

inherit rpm
