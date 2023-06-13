SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "lua51-lpeg-1.0.2-6.3.aarch64.rpm"
RPM_HASH = "58893af527b50e99f15b85ede807ee2356634530b206e1904dfb9ad6e7ac1491cad8112f2f99791d81c310a3c601f0ec2c0c936c98067cca0e1e0892c4290b5c"

RPROVIDES:${PN} += "lua51-LPeg \
lua51-lpeg \
lua51-lpeg(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
lua51"

inherit rpm
