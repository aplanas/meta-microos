SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python311-lupa-1.14.1-2.3.aarch64.rpm"
RPM_HASH = "54906ebf45975d627b0bee53ba53b4f3c34e4370e5dbc0187373048ccc6780f2c38c6f47d7aa1c2ced4359a455c78f73cc285eb8c950863cb57f6718df5b9600"

RPROVIDES:${PN} += "python3-lupa \
python3.11dist-lupa \
python311-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
