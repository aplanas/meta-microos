SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr0-8.4-5.1.aarch64.rpm"
RPM_HASH = "21e16c8cc0b96084f973c67abb013d49fd09c5d9228edba89f42b2f1f9e95330592642a8916598663769e11dc22f4fdf0516d094afcfee1f25bd46937bcdc713"

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
