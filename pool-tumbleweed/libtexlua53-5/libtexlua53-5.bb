SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libtexlua53-5-5.3.6-93.2.aarch64.rpm"
RPM_HASH = "e690d05db7c855051ecf52bb187855f01fded418b6302d7ccbb1a8762ff2c35fea23ab55a58b487ccf67fc0206fedec4cbd1b15a71afa2a1561017ddb36cd0cf"

RPROVIDES:${PN} += "libtexlua53-5 \
libtexlua53.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
