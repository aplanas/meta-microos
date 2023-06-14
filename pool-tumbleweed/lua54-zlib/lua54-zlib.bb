SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.2+git29"

RPM_NAME = "lua54-zlib-1.2+git29-2.2.aarch64.rpm"
RPM_HASH = "8e7bfc3be8bdf562e450fdf50c84b10f235be3bc081b8234f31481ae658adb584bcde92e72fff8c98752ac8b4e9a32884baea641df6eaba873cb939ca1132667"

RPROVIDES:${PN} += "lua-zlib \
lua54-zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libz.so.1 \
lua54"

inherit rpm
