SUMMARY = "Bare libuv bindings for lua"
DESCRIPTION = "This library makes libuv available to lua scripts. It was made \
for the luvit project but should usable from nearly any lua \
project. \
 \
The library can be used by multiple threads at once. Each thread \
is assumed to load the library from a different lua_State. Luv \
will create a unique uv_loop_t for each state. You can't share uv \
handles between states/loops. \
 \
The best docs currently are the libuv docs themselves. Hopfully \
soon we'll have a copy locally tailored for lua."
LICENSE = "Apache-2.0"

PV = "1.43.0~0"

RPM_NAME = "lua54-luv-1.43.0~0-3.6.aarch64.rpm"
RPM_HASH = "e78bd4cee560c2a68f9423b49eec5a7963aedf485f342cc50144f881429c9be81ce4f7de8efca3734feef012e74865e1e4e3f1732bbc691de10886fcda241d9d"

RPROVIDES:${PN} += "lua-luv \
lua54-luv \
lua54-luv(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.4.so.5()(64bit) \
libuv.so.1()(64bit) \
lua54"

inherit rpm
