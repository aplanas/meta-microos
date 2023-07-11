SUMMARY = "Haskell time library"
DESCRIPTION = "This package provides the Haskell time library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-1.12.2-3.2.aarch64.rpm"
RPM_HASH = "b84e4972e1644c55efd3647b41011a3e9caa0e90cf0c4d79bdf01d61c72159329c96962ef2ff848ddba7d56849835706f598e36652a31b6f1a50bfb9f6e427a7"

RPROVIDES:${PN} += "ghc-time \
libHStime-1.12.2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
