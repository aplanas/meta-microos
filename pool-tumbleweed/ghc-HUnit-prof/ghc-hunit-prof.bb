SUMMARY = "Haskell HUnit profiling library"
DESCRIPTION = "This package provides the Haskell HUnit profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-prof-1.6.2.0-2.6.aarch64.rpm"
RPM_HASH = "4bff007e9e38626b1d992e8f587afb9d2c11ac3bef68aa9bd08598bd3f77c2cb8f0566ce49fb26da43e9ffd8c92bab10ea127d649eb4eb6f096e4446fed5182e"

RPROVIDES:${PN} += "ghc-HUnit-prof \
ghc-prof-HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb"

RDEPENDS:${PN} += "ghc-HUnit-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
