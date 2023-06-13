SUMMARY = "Haskell commutative-semigroups library development files"
DESCRIPTION = "This package provides the Haskell commutative-semigroups library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-devel-0.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "2b930a04cde1dfa80e3d1adaa9241898143651f77556fc3e7378c1c2e13d99f5339a99bb791b5243efb7ded6cf4829069a8f23b61b6d39183caa1aa10f248936"

RPROVIDES:${PN} += "ghc-commutative-semigroups-devel \
ghc-commutative-semigroups-devel(aarch-64) \
ghc-devel(commutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais)"

RDEPENDS:${PN} += "/bin/sh \
ghc-commutative-semigroups \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7)"

inherit rpm
