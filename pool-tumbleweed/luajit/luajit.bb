SUMMARY = "JIT compiler for Lua language"
DESCRIPTION = "A Just-In-Time Compiler for Lua language"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "luajit-2.1.0~beta3+git.1669107176.46aa45d-2.3.aarch64.rpm"
RPM_HASH = "62f28f7e3e9f8f269d2763f3e867e8f1a356de4f0040661e1adeec8e7ea978b283e926c544f41b2d93089cc257e113533692ac9e286d382de20d84145cb91447"

RPROVIDES:${PN} += "luajit"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
luajit-5-1-2"

inherit rpm
