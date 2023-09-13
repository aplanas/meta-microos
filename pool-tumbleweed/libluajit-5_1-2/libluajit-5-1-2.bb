SUMMARY = "Library for JIT Lua compiler"
DESCRIPTION = "Libraries to use JIT Lua compiler"
LICENSE = "MIT"

PV = "5.1.2.1.0+git.1693350652.41fb94d"

RPM_NAME = "libluajit-5_1-2-5.1.2.1.0+git.1693350652.41fb94d-1.1.aarch64.rpm"
RPM_HASH = "200a5c7e7d36ec908824577f98089ddcd90d7fcdc323de09d9fb6ee3de6e7b99456a1a6da523b5e420e2bba67670cc5d5e968b6e2df68a1504660326f1aee0ab"

RPROVIDES:${PN} += "libluajit-5-1-2 \
libluajit-5.1.so.2 \
luajit-5-1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
