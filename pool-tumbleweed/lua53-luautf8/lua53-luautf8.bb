SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "lua53-luautf8-0.1.5-2.4.aarch64.rpm"
RPM_HASH = "786337d9599bf3a217c0c3f6c7005bfcdb178a3f79a03b6704b9567172edf60275f30603cb543a1b3f8e343780e8ee688fcdc6e8fe7ab74f90c19e615d71802a"

RPROVIDES:${PN} += "lua53-luautf8"

RDEPENDS:${PN} += "libc.so.6 \
lua53"

inherit rpm
