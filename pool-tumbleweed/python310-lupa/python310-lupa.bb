SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python310-lupa-1.14.1-3.1.aarch64.rpm"
RPM_HASH = "8d73aa22bceb331ea89f14fff66d2c401d7cd0bdd49c5929d27c42fc2452da3634294a6bef22ce8cdeeaa3facd14c37b202f1b30d3772f2997ee9fe9e6e9f02a"

RPROVIDES:${PN} += "python3.10dist-lupa \
python310-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
