SUMMARY = "This is a binding to libunbound for Lua"
DESCRIPTION = "This is a binding to libunbound for Lua"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "lua53-luaunbound-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "21d2efead861dd683e484f65eeb738ea8aee5703e3a27194aef7b082bf1bf4de6963eedd16c0a41f04037cf6f3cd3098e3aa164d694f16e85995105e39de7fc7"

RPROVIDES:${PN} += "lua53-luaunbound \
lua53-luaunbound(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.3.so.5()(64bit) \
libunbound.so.8()(64bit)"

inherit rpm
