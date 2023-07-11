SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "lua51-luautf8-0.1.5-2.5.aarch64.rpm"
RPM_HASH = "4ad9a614192c7d097e36f71165c1af78906934b282b86d36adce6de3bdc7f39ae8d60e4ffd417ec6a027dd04862f163bad100a572e128eea42d32a28737bc59f"

RPROVIDES:${PN} += "lua51-luautf8"

RDEPENDS:${PN} += "libc.so.6 \
lua51"

inherit rpm
