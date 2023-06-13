SUMMARY = "Lua, an embeddable scripting language"
DESCRIPTION = "This package provides bindings and types to bridge Haskell and \
<https://www.lua.org/ Lua>. \
 \
The full Lua interpreter version 5.4.4 is included. Alternatively, a \
system-wide Lua installation can be linked instead."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "f958be13410de8d8e55c08df2f092e2a3481161dd6355430acb1746e3486853f0ff0414e4222d9d82b456d1f43dc64fdfcd26632310fd5f2a2ca92aa24ae83f5"

RPROVIDES:${PN} += "ghc-lua \
ghc-lua(aarch-64) \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
