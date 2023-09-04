SUMMARY = "Generically newtype to use with DerivingVia"
DESCRIPTION = "This is a compatibility package as 'Generically' and 'Generically1' newtypes \
are available since 'base-4.17' in 'GHC.Generics'."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "76b6fe677b7ac952b0699d77eb9f0f91757927a157ccb85c146a3582856dc216e22a6484d43b65991f5ab9f5890dd6e824e8d3d45656faebff2c6333f42ed8d4"

RPROVIDES:${PN} += "ghc-generically \
libHSgenerically-0.1.1-CmULdC2547fBrHCkT48ujn-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
