SUMMARY = "Haskell unicode-collation profiling library"
DESCRIPTION = "This package provides the Haskell unicode-collation profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.5"

RPM_NAME = "ghc-unicode-collation-prof-0.1.3.5-1.1.aarch64.rpm"
RPM_HASH = "55506a6d42ef4b58cf4ef4bbf099610f29f0281ec8514d048008906bf44800dc05651f9e8b7afed882ca1ba48380310e0c44396484ab55335f9d4792f9abf390"

RPROVIDES:${PN} += "ghc-prof-unicode-collation-0.1.3.5-IFdGKnlU7nK53rXIDeXQnQ \
ghc-unicode-collation-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-unicode-collation-devel"

inherit rpm
