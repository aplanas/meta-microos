SUMMARY = "Haskell pretty library"
DESCRIPTION = "This package provides the Haskell pretty library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-1.1.3.6-3.1.aarch64.rpm"
RPM_HASH = "644afa81c7589cde7e43d47d3eb3cbe6914e8773938458e5624fc5cf52f57d3404ac7cd799e9e8167fc38b7b6b6f53407700c8c02cd0253647b3edf3583414da"

RPROVIDES:${PN} += "ghc-pretty \
libHSpretty-1.1.3.6-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
