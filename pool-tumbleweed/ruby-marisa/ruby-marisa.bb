SUMMARY = "Ruby bindings for marisa"
DESCRIPTION = "Ruby bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "ruby-marisa-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "fa78a527e2bc350d84cf9a818939b34efebf96bec0c662601058c46f96fd4186a94da0ac226ef2f7d2c50d457be86c3a4ef057a8b909b76d2ac30b25f0e82222"

RPROVIDES:${PN} += "ruby-marisa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmarisa.so.0 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
marisa \
ruby"

inherit rpm
