SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libplist++-2_0-3-2.2.0-4.7.aarch64.rpm"
RPM_HASH = "3762585bc520cb342b061666e78341918bccee57ed16bcc65ecad2cfc628c22d6384c14ee3b78f7ff1eadc15e6565dde0b10d31c6fc5cf778b92cac5ea24d4a2"

RPROVIDES:${PN} += "libplist++-2-0-3 \
libplist++-2.0.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libplist-2.0.so.3 \
libstdc++.so.6"

inherit rpm
