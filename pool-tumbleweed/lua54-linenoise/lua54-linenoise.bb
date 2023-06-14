SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua54-linenoise-0.9-2.4.aarch64.rpm"
RPM_HASH = "745b77f8395c082c8a942dddae3eb4bff85fa23dc84384f489382631e48b7853d32c9bfc8fa6652b8985507665fad8578f302f54b17b9fe9dd83bd2ac83efc11"

RPROVIDES:${PN} += "lua-linenoise \
lua54-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
lua54"

inherit rpm
