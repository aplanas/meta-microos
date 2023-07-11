SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python39-lupa-1.14.1-2.3.aarch64.rpm"
RPM_HASH = "eb3893bb1a56f6189fe3705ce849291b8b6d221ff19ec58d8cdf8231fa7e02f6fcef0da5830654d9dce462de63c3416b93405c306a3ecdc6b1ec9182d8134b8d"

RPROVIDES:${PN} += "python3.9dist-lupa \
python39-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
