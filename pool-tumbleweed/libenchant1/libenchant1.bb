SUMMARY = "Generic Spell Checking Library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "libenchant1-1.6.1-6.4.aarch64.rpm"
RPM_HASH = "a66e1d8b0f4dc4f8300a243f406904e0b904edb98d0aa27d9833db670299a7428ad45ea5eaf67f3f5ad39887be1f0b1068537c7217d4764220329f141c6a5c85"

RPROVIDES:${PN} += "enchant \
libenchant.so.1 \
libenchant1"

RDEPENDS:${PN} += "/sbin/ldconfig \
enchant-1-backend \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0"

inherit rpm
