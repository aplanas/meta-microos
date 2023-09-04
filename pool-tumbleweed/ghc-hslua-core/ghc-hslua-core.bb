SUMMARY = "Bindings to Lua, an embeddable scripting language"
DESCRIPTION = "Wrappers and helpers to bridge Haskell and <https://www.lua.org/ Lua>. \
 \
It builds upon the /lua/ package, which allows to bundle a Lua interpreter with \
a Haskell program."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-2.3.1-1.8.aarch64.rpm"
RPM_HASH = "68a232cea4675b34068ee2e8c8c72338f7c320464c8b6684842967d8b21bc02e1b4ba566d055d959ea872a7c11b0efe377c9383a779a3e4ee1b15b9e20724a9f"

RPROVIDES:${PN} += "ghc-hslua-core \
libHShslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSlua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
