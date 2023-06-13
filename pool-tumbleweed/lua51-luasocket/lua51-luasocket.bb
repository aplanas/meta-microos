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

RPM_NAME = "lua51-luasocket-3.1.0-2.2.aarch64.rpm"
RPM_HASH = "e9068eecfddc8b78ca4511562444a911e08be4b3e104a66f2e29f4980cc4bfa55fb9ca3106c9ed2dc4d9bd82f738cf31b70e2f95856ae4782bcc3f3e8730f802"

RPROVIDES:${PN} += "lua51-luasocket \
lua51-luasocket(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
lua51"

inherit rpm
