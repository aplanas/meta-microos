SUMMARY = "Lua, an embeddable scripting language"
DESCRIPTION = "This package provides bindings and types to bridge Haskell and \
<https://www.lua.org/ Lua>. \
 \
The full Lua interpreter version 5.4.4 is included. Alternatively, a \
system-wide Lua installation can be linked instead."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-2.3.1-1.8.aarch64.rpm"
RPM_HASH = "1cfc6dc634affc251b31b930756136ade02847a0445f0028f711fa13413ae949bd324c15da3ad799515b571b7b82e570dd985f7cd91ff4f9b622e136a9ef334e"

RPROVIDES:${PN} += "ghc-lua \
libHSlua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
