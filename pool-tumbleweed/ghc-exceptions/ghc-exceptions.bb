SUMMARY = "Haskell exceptions library"
DESCRIPTION = "This package provides the Haskell exceptions library."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-0.10.5-3.2.aarch64.rpm"
RPM_HASH = "1f3f88beaa9aae049c1a8d8fb3e976613a018f5d3697c49f0d33f77975fd53eab7fb016ff14d29390f696a86002c48e52de0f66997be4b016d47164908b43ebb"

RPROVIDES:${PN} += "ghc-exceptions \
libHSexceptions-0.10.5-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
