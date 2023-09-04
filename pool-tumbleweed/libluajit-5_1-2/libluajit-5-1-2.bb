SUMMARY = "Library for JIT Lua compiler"
DESCRIPTION = "Libraries to use JIT Lua compiler"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "libluajit-5_1-2-2.1.0~beta3+git.1669107176.46aa45d-3.1.aarch64.rpm"
RPM_HASH = "a360d5722bc8a71bb0fdbafa839d828af3b371a8afcb0007d1cd2dc7fd2240daa114cc0e22c431895e16122143cd763a59d97f3f56f3c76904b3fb30a61bc456"

RPROVIDES:${PN} += "libluajit-5-1-2 \
libluajit-5.1.so.2 \
luajit-5-1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
