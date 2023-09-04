SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python311-lupa-1.14.1-3.1.aarch64.rpm"
RPM_HASH = "a4840633b9b5923a3b6913b346c6e5990d3e0362e8806a3447fcfcb28611fa6c0a47e59ab8c4d6bad9e6a290a9a337855db4552c47d70ab9098a2186552852ce"

RPROVIDES:${PN} += "python3-lupa \
python3.11dist-lupa \
python311-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
