SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua54-lua-ev-1.5-4.2.aarch64.rpm"
RPM_HASH = "c0cccb61ce9e3f034770cb63edff563e13ff1ac76e8ab6e1e6e66bd4c133673e8fa15c8ddc5e69e9d36b59b2070671a48b5e4b0d9e6e06218aab87a817515616"

RPROVIDES:${PN} += "lua-lua-ev \
lua54-lua-ev \
lua54-lua-ev(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libev.so.4()(64bit) \
liblua5.4.so.5()(64bit) \
lua54"

inherit rpm
