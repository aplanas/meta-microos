SUMMARY = "JIT compiler for Lua language"
DESCRIPTION = "A Just-In-Time Compiler for Lua language"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "luajit-2.1.0~beta3+git.1669107176.46aa45d-2.4.aarch64.rpm"
RPM_HASH = "6f52b040188668e483e45ab95bc530effb8bd6347f1f393f28b1b77a31966f15019ed47037fffb0746bd65e1d0aa08cfc1e3f0e3668984ecb69167e0e62af928"

RPROVIDES:${PN} += "luajit"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
luajit-5-1-2"

inherit rpm
