SUMMARY = "Haskell deepseq library"
DESCRIPTION = "This package provides the Haskell deepseq library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-1.4.8.0-3.2.aarch64.rpm"
RPM_HASH = "a4474b965a4ba13732f96dff00f77c27aff0dadf21d9b7cb76c3261e528157b4085b085151a6c18cc5cb8522af8e621dfb8a2901cc10f2ba11f878c1160e9f44"

RPROVIDES:${PN} += "ghc-deepseq \
libHSdeepseq-1.4.8.0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
