SUMMARY = "Lua Language Server coded by Lua"
DESCRIPTION = "This package provides a Language Server Protocol (LSP) implementation for Lua."
LICENSE = "MIT"

PV = "3.6.18"

RPM_NAME = "lua-language-server-3.6.18-1.1.aarch64.rpm"
RPM_HASH = "630d6349b3fe17464d785f119adb76b5a9394bb5c8e1557c9680fea6b0f9178df1e2cf14ea85d82a5d819ef675a8282ed11ecbb3335590bfeaa71cae140315e1"

RPROVIDES:${PN} += "lua-language-server \
lua-language-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.36)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
