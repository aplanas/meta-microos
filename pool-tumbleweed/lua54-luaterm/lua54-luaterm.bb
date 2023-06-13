SUMMARY = "Terminal operations for Lua"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.07"

RPM_NAME = "lua54-luaterm-0.07-8.2.aarch64.rpm"
RPM_HASH = "91743275f32a114a95d9accae58dd16eb8df78b86e2c5baa3ab38beae3765dcc59e6e59a7ce6cca66fccaae6af3444ed029ac52c2491d78ab21b97fc9792c861"

RPROVIDES:${PN} += "lua-luaterm \
lua54-luaterm \
lua54-luaterm(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
lua54"

inherit rpm
