SUMMARY = "Haskell deepseq library"
DESCRIPTION = "This package provides the Haskell deepseq library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-1.4.8.0-3.1.aarch64.rpm"
RPM_HASH = "6b044415112476887f4f795bf26cbfbd78bf98056b0c91fdb510bbf7fbc147aaeee64861b49da39111b1d033581fda6b3e980ec90cff498e714135b3ea5708df"

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
