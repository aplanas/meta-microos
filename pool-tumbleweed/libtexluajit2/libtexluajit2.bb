SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "libtexluajit2-2.1.0beta3-93.1.aarch64.rpm"
RPM_HASH = "bfcbf9899046c5a62b2243aeb51e25f6d21c0e8c899db7aa0eaf5c332cba187f1c3b503071d130a5c4d232cf44fa2a8017ae82127725f6bafee07fa2c013c63e"

RPROVIDES:${PN} += "libtexluajit.so.2 \
libtexluajit2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
