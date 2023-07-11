SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua53-lua-ev-1.5-4.3.aarch64.rpm"
RPM_HASH = "f4241492da10343aa4028f02d7903e1d49e3090056766a164da617f081ad2afdc264d7c620bafc7dc2a721a7f94bd3dc4da6c0d38018964ad7163cdfced163f5"

RPROVIDES:${PN} += "lua53-lua-ev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
liblua5.3.so.5 \
lua53"

inherit rpm
