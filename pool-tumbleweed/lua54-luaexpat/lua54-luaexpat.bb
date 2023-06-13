SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "lua54-luaexpat-1.4.1-4.2.aarch64.rpm"
RPM_HASH = "50ab4df305ac57326c773232f6cef937c92bb3d3704f975d88e070b10c6ff6b549c079199cf41dfb2b77f7ad9cf6dcde0140016a257295f9578747cc7dfa5def"

RPROVIDES:${PN} += "lua-luaexpat \
lua54-luaexpat \
lua54-luaexpat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
lua54"

inherit rpm
