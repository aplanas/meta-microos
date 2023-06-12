SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "lua53-luaexpat-1.4.1-4.2.aarch64.rpm"
RPM_HASH = "2e449e35f0f3d8bf6f3394c1bde4a47f0b21cd5dc4553bf601976a7163ba5911b8a9e32018d7e3fd47f0dbd515f8f7ae064cb1056c931672a696d205089bb3d4"

RPROVIDES:${PN} += "lua53-luaexpat \
lua53-luaexpat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexpat.so.1()(64bit) \
lua53"

inherit rpm
