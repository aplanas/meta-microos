SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "lua54-lpeg-1.0.2-6.3.aarch64.rpm"
RPM_HASH = "a7a647fa43e6988bbc021866482587ff67edd6c8e021da939ae1ea4d07e118ea486a08451dc389d7c01e598b563f506c35e874adc205563f2d4b27be4bf8233c"

RPROVIDES:${PN} += "lua-lpeg \
lua54-LPeg \
lua54-lpeg \
lua54-lpeg(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
lua54"

inherit rpm
