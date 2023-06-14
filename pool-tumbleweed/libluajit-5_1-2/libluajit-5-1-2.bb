SUMMARY = "Library for JIT Lua compiler"
DESCRIPTION = "Libraries to use JIT Lua compiler"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "libluajit-5_1-2-2.1.0~beta3+git.1669107176.46aa45d-2.3.aarch64.rpm"
RPM_HASH = "a9083cef58c8f907d2c9dac0d6f066a5dccfb0aded6c7fa76bfd34d30793bac3b877fbc2d7d5ef079d24b967b9f1457cd3970725637fbffb8c1da8b1d237b070"

RPROVIDES:${PN} += "libluajit-5-1-2 \
libluajit-5.1.so.2 \
luajit-5-1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
