SUMMARY = "Haskell monoid-subclasses profiling library"
DESCRIPTION = "This package provides the Haskell monoid-subclasses profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-prof-1.2.3-1.7.aarch64.rpm"
RPM_HASH = "18679c87d242e1c90520a7e46b5c746f06554d2224962fc2cdc11bce801f51c05ba94bff7525a6e5c418edb5b24ec5d62d8527508f12d064c0581b2b97e634ac"

RPROVIDES:${PN} += "ghc-monoid-subclasses-prof \
ghc-prof-monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR"

RDEPENDS:${PN} += "ghc-monoid-subclasses-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-commutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais \
ghc-prof-containers-0.6.7 \
ghc-prof-primes-0.2.1.0-EDehUtw1pOPPL7EktYCRg \
ghc-prof-text-2.0.2 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
