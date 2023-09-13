SUMMARY = "JIT compiler for Lua language"
DESCRIPTION = "A Just-In-Time Compiler for Lua language"
LICENSE = "MIT"

PV = "5.1.2.1.0+git.1693350652.41fb94d"

RPM_NAME = "luajit-5.1.2.1.0+git.1693350652.41fb94d-1.1.aarch64.rpm"
RPM_HASH = "d59a7ca2c12aa121ebba9942537757567510dbc227e72344f61b50dceddbdf65c480220ee15111070398ce7dbcdfc585d62468a63a08dec0797c750ffc539604"

RPROVIDES:${PN} += "lua51-luajit \
luajit \
moonjit"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
luajit-5-1-2"

inherit rpm
