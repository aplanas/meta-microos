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
libenchant-zemberek.so \
locale-enchant-1-az \
locale-enchant-1-tk \
locale-enchant-1-tr \
locale-enchant-1-tt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
