SUMMARY = "Haskell pretty library"
DESCRIPTION = "This package provides the Haskell pretty library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-1.1.3.6-1.1.aarch64.rpm"
RPM_HASH = "2b7af6a5afb981de1e03d240a79ab4074fa2bd2fc4f04368c38d65e36bebf6f18dec2998da345e678581ebd859a3ec7a9c200e7d63240b172b5b652eba42c57c"

RPROVIDES:${PN} += "ghc-pretty \
libHSpretty-1.1.3.6-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
