SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python310-lupa-1.14.1-1.5.aarch64.rpm"
RPM_HASH = "7ab76acd80071e97a02420b7e329852c8ccc0f26c1cc4c4647d9bd5d12accaa3536d33d231267307d22f084d3a258281f853f7fafd9b850b5380d17175a28fed"

RPROVIDES:${PN} += "python3-lupa \
python3.10dist(lupa) \
python310-lupa \
python310-lupa(aarch-64) \
python3dist(lupa)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libluajit-5.1.so.2()(64bit) \
python(abi)"

inherit rpm
