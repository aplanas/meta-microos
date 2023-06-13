SUMMARY = "A binding of libevent to Lua"
DESCRIPTION = "This is a binding of libevent to Lua. It will serve as a drop-in \
replacement for copas, and eventually support more features \
(async DNS, HTTP, RPC...)."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "lua51-luaevent-0.4.6-4.2.aarch64.rpm"
RPM_HASH = "d44a0bcee302306128208931c4ca5e75e21afc094a2af21e3d3116981c9ff08465f63a5a5fb093d9c02a2129b781466a70c1e8d511aba6c2fc72d77c29da2bf4"

RPROVIDES:${PN} += "lua51-event \
lua51-luaevent \
lua51-luaevent(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libevent-2.1.so.7()(64bit) \
lua51 \
lua51-luasocket"

inherit rpm
