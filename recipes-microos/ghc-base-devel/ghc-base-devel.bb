SUMMARY = "Haskell base library development files"
DESCRIPTION = "This package provides the Haskell base library development files."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-devel-4.17.1.0-1.1.aarch64.rpm"
RPM_HASH = "eff42d6048283fff7cb916c3aaddbb8c23a8b29687e35829c1819b2c2e684e31e49d2cccb43b306620954b2ce6ab8cdfa7b5a24c4980766ba2e2951bfe3a408e"

RPROVIDES:${PN} += "ghc-base-devel ghc-base-devel(aarch-64) ghc-base-static ghc-base-static(aarch-64) ghc-devel(base-4.17.1.0) ghc-devel(ghc-bignum-1.3) ghc-devel(ghc-prim-0.9.0) ghc-devel(integer-gmp-1.1) ghc-devel(rts-1.0.2) ghc-devel(system-cxx-std-lib-1.0)"
RDEPENDS:${PN} += "ghc-base(aarch-64) ghc-compiler gmp-devel libdw-devel libelf-devel libffi-devel libnuma-devel"

inherit rpm
