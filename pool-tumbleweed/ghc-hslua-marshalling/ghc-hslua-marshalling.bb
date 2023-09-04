SUMMARY = "Marshalling of values between Haskell and Lua"
DESCRIPTION = "Provides functions to marshal values from Haskell to Lua, and /vice versa/. \
 \
This package is part of HsLua, a Haskell framework built around the embeddable \
scripting language <https://lua.org Lua>."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "bf516a404cc22713f49a850eaf8d89a2bdc64f92c604d536b43d632011ec6a615557ff60e5d7f76ad115d2db43103aedc9f54b414517de4a647c27807f4aed75"

RPROVIDES:${PN} += "ghc-hslua-marshalling \
libHShslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk-ghc9.4.6.so \
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
