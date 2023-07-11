SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "lua53-luautf8-0.1.5-2.5.aarch64.rpm"
RPM_HASH = "b55f38ba15cf0d32c34496a0278623161c9c40c8b39149053d0709f49141c95eafc2d5e14fbb7071404c67a9521abe9728794784da341b58ed7a2dcdc865e073"

RPROVIDES:${PN} += "lua53-luautf8"

RDEPENDS:${PN} += "libc.so.6 \
lua53"

inherit rpm
