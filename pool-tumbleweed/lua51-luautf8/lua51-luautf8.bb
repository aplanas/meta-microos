SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "lua51-luautf8-0.1.5-2.4.aarch64.rpm"
RPM_HASH = "38fde1d7b349d26cbb2415f7333ae052d4955964fa1252065c6a4bb7b5c9a6a093d67878fc4a78ede014f0161b823bdcebf54d4bf23a5862a9921fc92b5edf1a"

RPROVIDES:${PN} += "lua51-luautf8"

RDEPENDS:${PN} += "libc.so.6 \
lua51"

inherit rpm
