SUMMARY = "Platform independent system calls for Lua"
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
LICENSE = "MIT"

PV = "0.21"

RPM_NAME = "lua54-luasystem-0.21-5.2.aarch64.rpm"
RPM_HASH = "47a61adcfcd1b77da03b1d7ad7aed4ad82e2b010b195b4534266a2962904d5bfbf2ca51266c80f089c1af864de1a0190a863b07b8bc3477ec08d3eb721304857"

RPROVIDES:${PN} += "lua-luasystem \
lua54-luasystem \
lua54-luasystem(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
lua54"

inherit rpm
