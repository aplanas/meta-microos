SUMMARY = "Bindings to Lua, an embeddable scripting language"
DESCRIPTION = "Wrappers and helpers to bridge Haskell and <https://www.lua.org/ Lua>. \
 \
It builds upon the /lua/ package, which allows to bundle a Lua interpreter with \
a Haskell program."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "52437811c6b4161dfe7658c3dd017ea9160f85ec1e0e9cbb8b272f2a7172b9d13504633e8a7cc32e3f58e1aececb7cf63ffff1817c942e0d07008191769381f3"

RPROVIDES:${PN} += "ghc-hslua-core \
ghc-hslua-core(aarch-64) \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
