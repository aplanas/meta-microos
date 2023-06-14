SUMMARY = "ISpell/Myspell backends for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides the ispell and myspell backends."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backends-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "3c648731671824df5ad94d30c10b092a0c02f8c228c4bc4fbbec5778d835f97564a12614d1911eabf5ad0e9ca668a8d764ba095b587b8396b8f7fb0f4b4b0837"

RPROVIDES:${PN} += "enchant-1-backend \
enchant-1-backends \
libenchant-ispell.so \
libenchant-myspell.so \
libenchant1-/usr/lib64/enchant/libenchant-ispell.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
