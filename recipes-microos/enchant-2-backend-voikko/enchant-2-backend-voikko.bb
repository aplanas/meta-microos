SUMMARY = "Voikko backend for the Enchant spell checking library"
DESCRIPTION = "Voikko plugin (Finnish) for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-2-backend-voikko-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "4e4c8919e03c7ad1622e83fb18cc3c8554cedf464852202a9bc66e091a9220ee742dbabb766737719ba204f35a19e97a43953ab69d0f405130d07160e1236949"

RPROVIDES:${PN} += "enchant-2-backend enchant-2-backend-voikko enchant-2-backend-voikko(aarch-64) locale(libenchant-2-2:fi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) libvoikko.so.1()(64bit)"

inherit rpm
