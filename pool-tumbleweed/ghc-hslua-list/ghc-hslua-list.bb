SUMMARY = "Opinionated, but extensible Lua list type"
DESCRIPTION = "List type for Lua, with a Haskell interface."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-1.1.1-2.5.aarch64.rpm"
RPM_HASH = "f1b772bd63101055c0b8d60976acc0bae2060a0429b6d539f2c06a0128cba75189d41262c473806531745636dbbeac28990e10bf37bf02066bfef4c628313929"

RPROVIDES:${PN} += "ghc-hslua-list \
libHShslua-list-1.1.1-2YSx4pSaGRhHpPDWFYeDXu-ghc9.4.6.so"

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
