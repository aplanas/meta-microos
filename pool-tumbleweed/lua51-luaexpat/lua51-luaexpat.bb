SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "lua51-luaexpat-1.4.1-4.2.aarch64.rpm"
RPM_HASH = "5117ffa326a521163af91d58733f30e2ce977ea9412d2d3d8d997184bc7ad164ba4355efde5a64b32129b5ce3360add249543cd607c3f53cafb9896a4a132c8e"

RPROVIDES:${PN} += "lua51-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
lua51"

inherit rpm
