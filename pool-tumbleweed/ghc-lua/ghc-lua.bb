SUMMARY = "Lua, an embeddable scripting language"
DESCRIPTION = "This package provides bindings and types to bridge Haskell and \
<https://www.lua.org/ Lua>. \
 \
The full Lua interpreter version 5.4.4 is included. Alternatively, a \
system-wide Lua installation can be linked instead."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-2.3.1-1.6.aarch64.rpm"
RPM_HASH = "fc2941a514061be125bd990a4a0c2dd3e5b7662879a5be463ae9b9a6c33c9bdf8b178d91b39a6e93841094c7ff962cd69f6deebfb9276fb570ef7a3c3f164424"

RPROVIDES:${PN} += "ghc-lua \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
