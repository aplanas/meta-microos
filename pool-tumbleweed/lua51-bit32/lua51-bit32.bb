SUMMARY = "Lua bit manipulation library"
DESCRIPTION = "bit32 is the native Lua 5.2 bit manipulation library, in the version \
from Lua 5.3; it is compatible with Lua 5.1, 5.2 and 5.3."
LICENSE = "MIT"

PV = "5.3.5.1"

RPM_NAME = "lua51-bit32-5.3.5.1-9.2.aarch64.rpm"
RPM_HASH = "99201efc799ef4d96026915d18049a6b290a48a929402df6414b41d422b8cfe0c434783c2ed6d51357f0478e40156b01aa24154feb6246de09f60a032630e21b"

RPROVIDES:${PN} += "lua51-bit32 \
lua51-bit32(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
