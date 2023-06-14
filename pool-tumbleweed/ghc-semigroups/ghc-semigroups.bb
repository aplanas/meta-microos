SUMMARY = "Anything that associates"
DESCRIPTION = "In mathematics, a semigroup is an algebraic structure consisting of a set \
together with an associative binary operation. A semigroup generalizes a monoid \
in that there might not exist an identity element. It also (originally) \
generalized a group (a monoid with all inverses) to a type where every element \
did not have to have an inverse, thus the name semigroup."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-0.20-2.2.aarch64.rpm"
RPM_HASH = "e0fb951b479b03b87d7c0e6ace079dca788b5a0441a7673ff6f2c35b3a5629b84169c85814faadb575a8413ab679dfe7bf9e8636dd44ba19465742c376db0a23"

RPROVIDES:${PN} += "ghc-semigroups \
libHSsemigroups-0.20-KtsaS4jNcGkoC9puVZ6vB-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
