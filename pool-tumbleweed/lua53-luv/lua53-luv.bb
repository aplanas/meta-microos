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

RPM_NAME = "lua53-luv-1.43.0~0-3.6.aarch64.rpm"
RPM_HASH = "184c6c27edc841c2582b13a48e925afad158d88563142f1d65cd636f48ffac9152aedda64958b4f7514e41fa0d46b2a559da079d16809d6754fa202c721696ea"

RPROVIDES:${PN} += "lua53-luv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libuv.so.1 \
lua53"

inherit rpm
