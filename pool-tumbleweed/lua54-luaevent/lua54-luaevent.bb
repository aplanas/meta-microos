SUMMARY = "A binding of libevent to Lua"
DESCRIPTION = "This is a binding of libevent to Lua. It will serve as a drop-in \
replacement for copas, and eventually support more features \
(async DNS, HTTP, RPC...)."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "lua54-luaevent-0.4.6-4.2.aarch64.rpm"
RPM_HASH = "3c20e2df55bbc906cfe5166ba5403302c332016265ca80d6138fd6a93c2d5dac95c275ae5985f355619dbcdd32e49d821e5b5a5f69fd65370096e7396a3cc619"

RPROVIDES:${PN} += "lua-luaevent \
lua54-event \
lua54-luaevent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
lua54 \
lua54-luasocket"

inherit rpm
