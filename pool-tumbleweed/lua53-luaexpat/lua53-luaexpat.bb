SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "lua53-luaexpat-1.5.1-1.1.aarch64.rpm"
RPM_HASH = "dbb68144d115790a7dbb572401f96bf9dd6c9260632643d390453dea86c813a443ebe4436703695f5062288665c33cb24cef3f5b326804037793a8be9092de73"

RPROVIDES:${PN} += "lua53-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
lua53"

inherit rpm
