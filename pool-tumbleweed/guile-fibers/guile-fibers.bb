SUMMARY = "Concurrent ML-like concurrency for Guile"
DESCRIPTION = "Fibers is a library written in Guile which provides Concurrent ML-like concurrency."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "guile-fibers-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "b431b3a129585337109ad103a0fff544bad52b56cbe3bb65bc46bea7861fa63aa7980ffb0ae098b45bac759b104d1b476b4ea1a39b8f1bc9a201404adea5f894"

RPROVIDES:${PN} += "guile-fibers"

RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1"

inherit rpm
