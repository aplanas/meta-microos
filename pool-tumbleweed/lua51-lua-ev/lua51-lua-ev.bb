SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua51-lua-ev-1.5-4.2.aarch64.rpm"
RPM_HASH = "fee2d63a523d216716a1ff9a343fb80115bb3fe0a7af108f3b4ed9d0f7ea2f425fbffdd3436a5c1a02c28146c496b82ebb5cb2333a17bb98c95659eb3bdaa94b"

RPROVIDES:${PN} += "lua51-lua-ev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
liblua5.1.so.5 \
lua51"

inherit rpm
