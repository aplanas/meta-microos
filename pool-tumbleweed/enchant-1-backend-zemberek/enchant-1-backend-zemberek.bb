SUMMARY = "Generic Spell Checking Library - Zemberek Plugin"
DESCRIPTION = "Zemberek plugin (Azeri, Turkmen, Turkish, Tatar) for enchant, a library \
providing an efficient extensible abstraction for dealing with \
different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backend-zemberek-1.6.1-6.4.aarch64.rpm"
RPM_HASH = "ff47f9ba1b9e81ad250899849946b3d905fc5b9abb0482bd5537d181c6115cda4bb7b16e81250ac1bae001ad269a95a4df6c82a0ae45401d4ad4cfcc72e4e1d5"

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
