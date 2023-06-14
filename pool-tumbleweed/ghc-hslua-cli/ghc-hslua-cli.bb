SUMMARY = "Command-line interface for Lua"
DESCRIPTION = "Provides an embeddable command-line interface for Lua. The interface is \
compatible with the standard Lua interpreter, i.e., the `lua` executable \
provided in a default Lua installation."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "036f2ce3871088dde61357fcf4c7c38491982440eb6a120f1751fb61f7a628b1641fdd68d5757999808e5de7b9966dc42391a0f24442c5fbc2175aa2d0388182"

RPROVIDES:${PN} += "ghc-hslua-cli \
libHShslua-cli-1.4.1-EEaz0ST6ErtHZSjIcYe3Kp-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so \
libHShslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq-ghc9.4.5.so \
libHShslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1-ghc9.4.5.so \
libHSisocline-1.0.9-7x8dFWbXh69GJxYhigSqXG-ghc9.4.5.so \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
