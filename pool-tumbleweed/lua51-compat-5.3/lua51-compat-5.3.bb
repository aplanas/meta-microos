SUMMARY = "Lua-5.3-style APIs for Lua 5.2 and 5.1"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua51-compat-5.3-0.10-9.2.aarch64.rpm"
RPM_HASH = "a4c05f623d4b1fe6262c3e39659c7bb2c7db3bf33371493a4c1383b79daf2dfa5dfcafcc4b3c530ae24d934ea726406fa246a5aba279fb5a334a6fad9e961a4d"

RPROVIDES:${PN} += "lua51-compat-5.3 \
lua51-compat-5.3(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
lua51 \
lua51-bit32"

inherit rpm
