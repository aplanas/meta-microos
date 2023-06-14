SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.2+git29"

RPM_NAME = "lua51-zlib-1.2+git29-2.2.aarch64.rpm"
RPM_HASH = "942690199a9e606391bb248fa795ec75aead1726a38e2fca88e126b6812faf30bb4a7c5fe045afa0659eac35dd126c730c5cc8f89b2cbdf9c28636b3341cc85f"

RPROVIDES:${PN} += "lua51-zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
libz.so.1 \
lua51"

inherit rpm
