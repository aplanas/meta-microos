SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.2+git29"

RPM_NAME = "lua54-zlib-1.2+git29-2.2.aarch64.rpm"
RPM_HASH = "8e7bfc3be8bdf562e450fdf50c84b10f235be3bc081b8234f31481ae658adb584bcde92e72fff8c98752ac8b4e9a32884baea641df6eaba873cb939ca1132667"

RPROVIDES:${PN} += "lua-zlib \
lua54-zlib \
lua54-zlib(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.4.so.5()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
lua54"

inherit rpm