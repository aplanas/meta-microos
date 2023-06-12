SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua53-lua-ev-1.5-4.2.aarch64.rpm"
RPM_HASH = "7b891b30da15b181e2fe98b4fa16c7a604ed72fc35b76d9f52c70a18dc22afea3efb61d316025338a3a109bfe736e67899e32838185787a5702980692bc4cf5d"

RPROVIDES:${PN} += "lua53-lua-ev \
lua53-lua-ev(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libev.so.4()(64bit) \
liblua5.3.so.5()(64bit) \
lua53"

inherit rpm
