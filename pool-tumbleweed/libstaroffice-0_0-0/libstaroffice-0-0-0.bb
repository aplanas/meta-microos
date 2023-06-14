SUMMARY = "A library for import of StarOffice documents"
DESCRIPTION = "libstaroffice is a library for import of StarOffice documents."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-0_0-0-0.0.7-3.9.aarch64.rpm"
RPM_HASH = "bd3301c4f21c7910e711bd13a946f5496ce793187e148808fb1309948fde57ee0d59528d86a9cecd6a8db43b5c19e5190dac43f1e977d447a537497f91a343ed"

RPROVIDES:${PN} += "libstaroffice-0-0-0 \
libstaroffice-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
