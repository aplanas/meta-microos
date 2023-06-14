SUMMARY = "A declarative terminal user interface library"
DESCRIPTION = "Write terminal user interfaces (TUIs) painlessly with 'brick'! You write an \
event handler and a drawing function and the library does the rest. \
 \
> module Main where > > import Brick > > ui :: Widget () > ui = str 'Hello, \
world!' > > main :: IO () > main = simpleMain ui \
 \
To get started, see: \
 \
* <https://github.com/jtdaugherty/brick/blob/master/README.md The README> \
 \
* The <https://github.com/jtdaugherty/brick/blob/master/docs/guide.rst Brick \
user guide> \
 \
* The demonstration programs in the 'programs' directory \
 \
This package deprecates <http://hackage.haskell.org/package/vty-ui vty-ui>."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-1.6-2.4.aarch64.rpm"
RPM_HASH = "4c1047bb0b3637e8780278cd26acbe6febb2a2cf63bd4110cfedcd635ab5bbbf8bb2ee72d4f9c25c23bb171d218b1f0295f4aab5c8863517fa5eb1eedcf73f66"

RPROVIDES:${PN} += "ghc-brick \
libHSbrick-1.6-LMplG6IsGlb3C6L6NTrgWE-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbimap-0.5.0-3nKyJuRybYg2I5XOsBhwKE-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHSconfig-ini-0.2.5.0-RR92dYVdpi9XWpA99EDX9-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHSdata-clist-0.2-LT5UCpKeur34zcxFsnpoqW-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSmegaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv-ghc9.4.5.so \
libHSmicrolens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1-ghc9.4.5.so \
libHSmicrolens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV-ghc9.4.5.so \
libHSmicrolens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSparser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHSterminfo-0.4.1.5-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-zipper-0.12-HAxIdT2NfEj1pbIOe2MIin-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSvty-5.38-E9MiSc6Hkm5LKREDrOQCil-ghc9.4.5.so \
libHSword-wrap-0.5-8lP0dTi9CAzDFiJFYJ3rcZ-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
