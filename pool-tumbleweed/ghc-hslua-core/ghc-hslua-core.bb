SUMMARY = "Bindings to Lua, an embeddable scripting language"
DESCRIPTION = "Wrappers and helpers to bridge Haskell and <https://www.lua.org/ Lua>. \
 \
It builds upon the /lua/ package, which allows to bundle a Lua interpreter with \
a Haskell program."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-2.3.1-1.6.aarch64.rpm"
RPM_HASH = "4b69dfe8eaa01b0d645533a79bfef6ca0b575716e0f299f2c2a1841b0237f34c01cb6987f8344672704ee0bbe9a8c484a608b7b382dfac24c3558fa188fd1c53"

RPROVIDES:${PN} += "ghc-hslua-core \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
