SUMMARY = "Isocline-based Lua REPL"
DESCRIPTION = "An embeddable Lua REPL built with Isocline and HsLua."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-hslua-repl-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "0157c161ba8a7508d70e0ef63cd289c930f95a7667daef598218d90876616475bddac9b0b34aaf172d19e0665c6ff6eda8955cfc6d2709cfd395eb56736a03d6"

RPROVIDES:${PN} += "ghc-hslua-repl \
ghc-hslua-repl(aarch-64) \
libHShslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so()(64bit) \
libHSisocline-1.0.9-7x8dFWbXh69GJxYhigSqXG-ghc9.4.5.so()(64bit) \
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
