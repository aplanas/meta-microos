SUMMARY = "Generic Spell Checking Library - Voikko Plugin"
DESCRIPTION = "Voikko plugin (Finnish) for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backend-voikko-1.6.1-6.4.aarch64.rpm"
RPM_HASH = "2564f8d5315f834f983ab6ce2f6413193e09f00ebc064ace3ac0f6a46fef9a22b34525b57b598a736e2c46005ecdf63f0449d5c697fe9b949b446358a9eef4e0"

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
