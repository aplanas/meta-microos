SUMMARY = "Haskell contravariant profiling library"
DESCRIPTION = "This package provides the Haskell contravariant profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-prof-1.5.5-2.8.aarch64.rpm"
RPM_HASH = "28bdbfda77638c49c2b2b73c5d5f3733a95ca8bb351aa623b9f3bd72b1227583af2f5d91c0d8001836b134e612d14e7c704f2a2ba4ab3bc0136489e0ce51e580"

RPROVIDES:${PN} += "ghc-contravariant-prof \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT"

RDEPENDS:${PN} += "ghc-contravariant-devel \
ghc-prof-StateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J \
ghc-prof-base-4.17.2.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
