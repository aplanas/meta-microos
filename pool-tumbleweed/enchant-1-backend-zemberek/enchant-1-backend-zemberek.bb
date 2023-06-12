SUMMARY = "Generic Spell Checking Library - Zemberek Plugin"
DESCRIPTION = "Zemberek plugin (Azeri, Turkmen, Turkish, Tatar) for enchant, a library \
providing an efficient extensible abstraction for dealing with \
different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backend-zemberek-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "5c2fcdc94081f5f860849fee9be95035aa4a0cef17dd1ced3e9edc128a1d4ff7bc4cbdcb7889b2072e3a0249f2396501680a7b9058b033c6fc2346166c35032e"

RPROVIDES:${PN} += "enchant-1-backend \
enchant-1-backend-zemberek \
enchant-1-backend-zemberek(aarch-64) \
libenchant_zemberek.so()(64bit) \
locale(enchant-1:az) \
locale(enchant-1:tk) \
locale(enchant-1:tr) \
locale(enchant-1:tt)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
