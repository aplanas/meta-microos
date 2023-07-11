SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "lua54-luautf8-0.1.5-2.5.aarch64.rpm"
RPM_HASH = "d6a38ade1bcd479b0b01443e13aa74c0653cb7bf866f604bd74eb9eeb3e519db012cad04d57d7570164c5fe76dcf3437aaec78520c873ef6e203282ef7f6e7e0"

RPROVIDES:${PN} += "lua-luautf8 \
lua54-luautf8"

RDEPENDS:${PN} += "libc.so.6 \
lua54"

inherit rpm
