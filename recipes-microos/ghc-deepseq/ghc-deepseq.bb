SUMMARY = "Haskell deepseq library"
DESCRIPTION = "This package provides the Haskell deepseq library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-1.4.8.0-1.1.aarch64.rpm"
RPM_HASH = "65ce377f21c32cc8589a4ebf4d8b672773f9f39b222bb47b9617bf169083427482e981b75b661812ba955d3286b0e98ed48dad0b88ec6ff65bfe3d64c33ca23f"

RPROVIDES:${PN} += "ghc-deepseq ghc-deepseq(aarch-64) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
