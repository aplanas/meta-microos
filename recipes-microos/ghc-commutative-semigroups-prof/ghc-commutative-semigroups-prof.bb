SUMMARY = "Haskell commutative-semigroups profiling library"
DESCRIPTION = "This package provides the Haskell commutative-semigroups profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-prof-0.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "0d7b5008b41878fe542fca9356af2709390498a18f8246d44d97cbf840f16f5d09a8356d7ac275622b604a95398dca6995b9a97eae297074aee375c06326be7f"

RPROVIDES:${PN} += "ghc-commutative-semigroups-prof \
ghc-commutative-semigroups-prof(aarch-64) \
ghc-prof(commutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais)"
RDEPENDS:${PN} += "ghc-commutative-semigroups-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7)"

inherit rpm
