SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "libtexluajit2-2.1.0beta3-92.1.aarch64.rpm"
RPM_HASH = "715411a03815b92c07bcc8b92f752521cc10d3a0daf866a44b5a94c8c552f5c56e4c6428bc452ab1011ca9aa3e2154d513c1f94bb860b3fd9fa1d57d68093dc9"

RPROVIDES:${PN} += "libtexluajit.so.2 \
libtexluajit2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
