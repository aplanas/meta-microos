SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "libtexluajit2-2.1.0beta3-91.1.aarch64.rpm"
RPM_HASH = "1cb87b1ee4a223fa87904b05a6ed7cbd73b9989191e0f98fdf9aca0e58cdaac7a7d789a96ad74c932193bf44ce2d729c5a8f9373cadad7cc0ed36257d87815a2"

RPROVIDES:${PN} += "libtexluajit.so.2 \
libtexluajit2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
