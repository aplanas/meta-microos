SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "lua51-luaexpat-1.5.1-1.1.aarch64.rpm"
RPM_HASH = "42b1c300d86349852be9b50285cda2c4acb1e7f53359fcc51603118cb6eeb1e54458816824c16a7e44870f93d53ee21b827e55d3d349215aae566f4033e9ee9c"

RPROVIDES:${PN} += "lua51-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
lua51"

inherit rpm
