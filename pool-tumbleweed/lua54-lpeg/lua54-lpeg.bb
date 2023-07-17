SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua54-lpeg-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "aa5c51e8a35e3d4c01b01642cf66c6c53c82a3ab756fae1ae875c4e88da17751ea3d2b95065099e5fff418cdddcec4b5ea85a4c3ef985df29e50e8f59cff0144"

RPROVIDES:${PN} += "lua-lpeg \
lua54-LPeg \
lua54-lpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
