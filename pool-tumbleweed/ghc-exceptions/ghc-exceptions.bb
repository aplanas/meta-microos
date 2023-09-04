SUMMARY = "Haskell exceptions library"
DESCRIPTION = "This package provides the Haskell exceptions library."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "18cf9167cb60c52ec35cf29c64fc945555d8cb236f044b1f44159d4a47f976f474ead9b9e9ba62f01b682bb8c909ea51739b117bf70064ac18be47e0f8692f70"

RPROVIDES:${PN} += "ghc-exceptions \
libHSexceptions-0.10.5-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
