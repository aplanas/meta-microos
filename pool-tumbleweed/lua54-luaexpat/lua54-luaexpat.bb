SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "lua54-luaexpat-1.5.1-1.1.aarch64.rpm"
RPM_HASH = "7b023ec5bd6a0d50198a303d01bee779f3bcd3453cabd546f97761ab2662db7dde6fbe37c42c4a8309730f5927f92ce7174d7fdb2cc5ae84745ddc3df01b3d4b"

RPROVIDES:${PN} += "lua-luaexpat \
lua54-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
lua54"

inherit rpm
