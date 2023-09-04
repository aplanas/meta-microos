SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "libtexluajit2-2.1.0beta3-93.2.aarch64.rpm"
RPM_HASH = "257547285cda258052ad73ec57a580d2f72538b22945b2d8dba060768f00d62ca2a47854012578ba3b6184a1ac2f188e20e2528277aa4c9425dc4d418f5b1279"

RPROVIDES:${PN} += "libtexluajit.so.2 \
libtexluajit2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
