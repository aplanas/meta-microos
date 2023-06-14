SUMMARY = "Cyrus SASL library for Lua 5.1+"
DESCRIPTION = "Provides Lua bindings for Cyrus SASL authentication library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "lua53-cyrussasl-1.1.0-3.2.aarch64.rpm"
RPM_HASH = "b57d175ffb570cd5d9e1d745d1246373cfb959c5280103d6bdc6fb13e434681b9605ae3f807ef5f84f0c8dbac4d51a719f2e7910a8e6b1587200e97567b7dab0"

RPROVIDES:${PN} += "lua53-cyrussasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsasl2.so.3 \
lua53"

inherit rpm
