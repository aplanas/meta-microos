SUMMARY = "Haskell template-haskell library"
DESCRIPTION = "This package provides the Haskell template-haskell library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-2.19.0.0-3.2.aarch64.rpm"
RPM_HASH = "92d638802c644c58203f34307b0db9f7097537e4f83e3b1673ad2addc81e98ff011d41a4289144fe72cd2fb1d58e410b4d94f9a0b16df91d2e0bd8289ef7e9b4"

RPROVIDES:${PN} += "ghc-template-haskell \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
