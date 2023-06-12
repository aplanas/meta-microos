SUMMARY = "Network support for the Lua language"
DESCRIPTION = "LuaSocket is a Lua extension library that is composed by two parts: a C core \
that provides support for the TCP and UDP transport layers, and a set of Lua \
modules that add support for functionality commonly needed by applications \
that deal with the Internet. \
 \
Among the support modules, the most commonly used implement the SMTP, HTTP \
and FTP. In addition there are modules for MIME, URL handling and LTN12."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua54-luasocket-3.1.0-2.2.aarch64.rpm"
RPM_HASH = "bc630556884e96c587764ca04df288a469529d09d459867134983e382bac8763e6a0a8cb6b9d1271137665108213c44e40b2222cbc06e02f5482acdd532c1293"

RPROVIDES:${PN} += "lua-luasocket \
lua54-luasocket \
lua54-luasocket(aarch-64) \
luasocket"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
lua54"

inherit rpm
