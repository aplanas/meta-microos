SUMMARY = "This is a binding to libunbound for Lua"
DESCRIPTION = "This is a binding to libunbound for Lua"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "lua54-luaunbound-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "86e696df11163f8ad7f96741326110f4aafda03c50d0eccc0fd2e1ea8b5d44c5d10c63489f292449b9c3c1b38867298e615e7e2d85a62dd30ee339937bcc7362"

RPROVIDES:${PN} += "lua-luaunbound \
lua54-luaunbound \
lua54-luaunbound(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.4.so.5()(64bit) \
libunbound.so.8()(64bit)"

inherit rpm
