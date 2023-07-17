SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua51-lpeg-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "11a076821a2fe2daf66b16009372ca09b935cd5b787287902fd139a2b22c1afecc5823dd7c5d02f648f6408db5524257b2c16119ac849c707c9c11cfa4a38f64"

RPROVIDES:${PN} += "lua51-LPeg \
lua51-lpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua51"

inherit rpm
