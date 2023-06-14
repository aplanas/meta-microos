SUMMARY = "Nuspell backend for the Enchant spell checking library"
DESCRIPTION = "Nuspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-2-backend-nuspell-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "cf2660f8da802a76acdb3ae84afe62f34552b0ae1f63483af2cc14a0b3ad4bf40cdf18a8766f85be88be705cd5ed0ad331f8397f2a63fcdaa6fc8b2946751b7d"

RPROVIDES:${PN} += "enchant-2-backend \
enchant-2-backend-nuspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicuuc.so.73 \
libnuspell.so.5 \
libstdc++.so.6"

inherit rpm
