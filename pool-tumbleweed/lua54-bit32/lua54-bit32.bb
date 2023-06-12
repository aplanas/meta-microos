SUMMARY = "Lua bit manipulation library"
DESCRIPTION = "bit32 is the native Lua 5.2 bit manipulation library, in the version \
from Lua 5.3; it is compatible with Lua 5.1, 5.2 and 5.3."
LICENSE = "MIT"

PV = "5.3.5.1"

RPM_NAME = "lua54-bit32-5.3.5.1-9.2.aarch64.rpm"
RPM_HASH = "519540001d5bf7228997c435367276022162f5d1f831e80baa8084980425249d75fba0166d9b2a3829be438d078503b47785372f6b9de2581ea30939830955a4"

RPROVIDES:${PN} += "lua-bit32 \
lua54-bit32 \
lua54-bit32(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
