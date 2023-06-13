SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python311-lupa-1.14.1-1.5.aarch64.rpm"
RPM_HASH = "93b1cebb80b638bcdb41a15d78600d1445b85a84eff8f39d98aa22ae070a76f1880d6ee6485a4d44cf76842a6b0ab6533e1e2e80f49eb050170e46a6d31196ca"

RPROVIDES:${PN} += "python3.11dist(lupa) \
python311-lupa \
python311-lupa(aarch-64) \
python3dist(lupa)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libluajit-5.1.so.2()(64bit) \
python(abi)"

inherit rpm
