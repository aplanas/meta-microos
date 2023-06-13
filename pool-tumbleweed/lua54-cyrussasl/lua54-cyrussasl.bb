SUMMARY = "Cyrus SASL library for Lua 5.1+"
DESCRIPTION = "Provides Lua bindings for Cyrus SASL authentication library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "lua54-cyrussasl-1.1.0-3.2.aarch64.rpm"
RPM_HASH = "0b1c13b059cef2361412f2b7c90cd562878d22e1ee8b3090c8e0851ab2921d8d588877073bccf0d2ea93b480ab7d129b346fb65f04b4675052223e0ee8c55fbe"

RPROVIDES:${PN} += "lua-cyrussasl \
lua54-cyrussasl \
lua54-cyrussasl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsasl2.so.3()(64bit) \
lua54"

inherit rpm
