SUMMARY = "Voikko backend for the Enchant spell checking library"
DESCRIPTION = "Voikko plugin (Finnish) for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-2-backend-voikko-2.2.15-3.3.aarch64.rpm"
RPM_HASH = "7cd5f4937d787b9f087f391af7a01d3298a05aa9f2058584768496032399395d60e8514ae4dd3512fdeb0e08f35e6bee2d73ee1ac5ca5386b3c49a8b5a97a9f8"

RPROVIDES:${PN} += "enchant-2-backend enchant-2-backend-voikko enchant-2-backend-voikko(aarch-64) locale(libenchant-2-2:fi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) libvoikko.so.1()(64bit)"

inherit rpm
