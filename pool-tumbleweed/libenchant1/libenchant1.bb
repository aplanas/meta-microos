SUMMARY = "Generic Spell Checking Library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "libenchant1-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "3646c74cbc2e4ab4345d5aa45d75e093c946d345ecfb4edf49b89642086af04e14bf91f1c05b967f32f1906f39153a95dd9f8bd764baa3c5f5d3b8f04a1b4e7c"

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
