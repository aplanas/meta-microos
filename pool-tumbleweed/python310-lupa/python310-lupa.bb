SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python310-lupa-1.14.1-2.3.aarch64.rpm"
RPM_HASH = "f220f184afd39b13fb911314c573a3cc2a6285a6ae092178c840b6a64347c8609625a9f2d306859ac5cc12bc23fcfa0dea103102b8de9c4d13efd1d0009d1be4"

RPROVIDES:${PN} += "python3.10dist-lupa \
python310-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
