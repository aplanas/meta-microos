SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua51-lua-ev-1.5-4.3.aarch64.rpm"
RPM_HASH = "234e93ce9571c306f1e203939cf7154b936c5a6440f7a0c382eab83842d5d4820365749c0734add864837028a0098215510b3d07f0e01ffc4c430f6445b19ff6"

RPROVIDES:${PN} += "lua51-lua-ev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
liblua5.1.so.5 \
lua51"

inherit rpm
