SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua53-lpeg-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "415d2d48a0ed5f354378aa071fddf9eb2fadfe8732c29aa076fd2323b157d82bcaf0d26e04c654054976630400f47afb1d3194ac88fe8c417c845ba8c57aa1ae"

RPROVIDES:${PN} += "lua53-LPeg \
lua53-lpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
