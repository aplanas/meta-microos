SUMMARY = "JIT compiler for Lua language"
DESCRIPTION = "A Just-In-Time Compiler for Lua language"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "luajit-2.1.0~beta3+git.1669107176.46aa45d-3.1.aarch64.rpm"
RPM_HASH = "16ee896be89c2eaf1ecb7060e1ef567b1e46351fe8a452e5ccdddcb5e497f67110947a71e13c87b1e3179589a9a2d6ab9b1c86f95aec2d108f95a426843081b8"

RPROVIDES:${PN} += "luajit"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
luajit-5-1-2"

inherit rpm
