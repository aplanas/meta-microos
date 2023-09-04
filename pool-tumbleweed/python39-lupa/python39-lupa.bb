SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python39-lupa-1.14.1-3.1.aarch64.rpm"
RPM_HASH = "5d35a1de09a37c28fde1f97dc6b853df26f5c1757df2ae921353a631c007e7784b36a88b3982257a6d2e578a42607e839788d7a6a6f763497c92615b521c6aa6"

RPROVIDES:${PN} += "python3.9dist-lupa \
python39-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
