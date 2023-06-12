SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua51-linenoise-0.9-2.4.aarch64.rpm"
RPM_HASH = "57acb3c71aa0ab923c309dc9337e1cd00636c236602b1b5ee4986966ba5268ee331219697aa4f55ac3715a000589d958aabaacd0c78aca6c4274d087ca421793"

RPROVIDES:${PN} += "lua51-linenoise \
lua51-linenoise(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
lua51"

inherit rpm
