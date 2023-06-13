SUMMARY = "A library for import of StarOffice documents"
DESCRIPTION = "libstaroffice is a library for import of StarOffice documents."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-0_0-0-0.0.7-3.9.aarch64.rpm"
RPM_HASH = "bd3301c4f21c7910e711bd13a946f5496ce793187e148808fb1309948fde57ee0d59528d86a9cecd6a8db43b5c19e5190dac43f1e977d447a537497f91a343ed"

RPROVIDES:${PN} += "libstaroffice-0.0.so.0()(64bit) \
libstaroffice-0_0-0 \
libstaroffice-0_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
