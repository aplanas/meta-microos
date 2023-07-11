SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr0-8.4-4.2.aarch64.rpm"
RPM_HASH = "2ab7a7e9bfb5c74543807ad1e6008fa814d55baa39129d717619af44bd5335c45199a35880284b64e499781614393ef5b9c8adcdbc6ca11dfa0d82c6d63b44c3"

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
