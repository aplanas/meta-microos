SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua54-lua-ev-1.5-4.3.aarch64.rpm"
RPM_HASH = "85631d560c13f66a646df6a7d80579a9ed2958adc963440144351f54b9ba7bd450ef10bb7d880c77e8a2e0918381952bbb04b601a1fd0bbe957b891e3a7265ac"

RPROVIDES:${PN} += "lua-lua-ev \
lua54-lua-ev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
liblua5.4.so.5 \
lua54"

inherit rpm
