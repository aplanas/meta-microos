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

RPM_NAME = "lua51-luv-1.43.0~0-3.6.aarch64.rpm"
RPM_HASH = "ac21f1a00c04c2c8215b503e32589a7691fc61ef288f940b70f1f4f2824a5e363eb2303a41793af70965f6374bcdc82f676cf87f0ab94ac29c186b1daf7e296b"

RPROVIDES:${PN} += "lua51-luv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
libuv.so.1 \
lua51"

inherit rpm
