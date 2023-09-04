SUMMARY = "Haskell time-compat profiling library"
DESCRIPTION = "This package provides the Haskell time-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-prof-1.9.6.1-5.9.aarch64.rpm"
RPM_HASH = "5142d7a79d5d0fdf97099442ba3195c7ba22c260906247cb5d0062ae1a401a905bfa2aa5ba84a61ad25a55e6d0399129ed1fdeed3b24facf83344c8f31e7c29b"

RPROVIDES:${PN} += "ghc-prof-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-time-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-time-1.12.2 \
ghc-time-compat-devel"

inherit rpm
