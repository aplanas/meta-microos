SUMMARY = "Haskell timerep profiling library"
DESCRIPTION = "This package provides the Haskell timerep profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-prof-2.1.0.0-1.8.aarch64.rpm"
RPM_HASH = "2043eb9fd712355dd0cf19ea6d91b761ae4b3b27cebf63a71c1c3f6254dd2f5e4b85f11a4fc782634a3fdec82b697b81c2e71381484a59f3f0cb40c12cad8e9a"

RPROVIDES:${PN} += "ghc-prof-timerep-2.1.0.0-I3sgV342xF22sEKbdw3Ltk \
ghc-timerep-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-timerep-devel"

inherit rpm
