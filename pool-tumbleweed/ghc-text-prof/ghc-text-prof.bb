SUMMARY = "Haskell text profiling library"
DESCRIPTION = "This package provides the Haskell text profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-prof-2.0.2-3.2.aarch64.rpm"
RPM_HASH = "1ab43c18b09e2a9ebd97bda5931d4c22ccd086202c086489726fa6c9ac0a462988f5f05bc6e83811b99e5ccd1f47841ab5e090e65fad42c6c104a10f47bc01b9"

RPROVIDES:${PN} += "ghc-prof-text-2.0.2 \
ghc-text-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-text-devel"

inherit rpm
