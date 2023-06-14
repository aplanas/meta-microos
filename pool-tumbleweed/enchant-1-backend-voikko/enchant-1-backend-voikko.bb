SUMMARY = "Generic Spell Checking Library - Voikko Plugin"
DESCRIPTION = "Voikko plugin (Finnish) for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backend-voikko-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "80b336a4c2a2c5094863f0bd62dd099521e5339385db831bb158936b4b5f94473e6f7ed956cc8f3bc98fbf3639ad28eeba54cc278a08c915b6b6cffa86d518d6"

RPROVIDES:${PN} += "enchant-1-backend \
enchant-1-backend-voikko \
libenchant-voikko.so \
locale-enchant-1-fi"

RDEPENDS:${PN} += "enchant-1-backends \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libglib-2.0.so.0 \
libvoikko.so.1"

inherit rpm
