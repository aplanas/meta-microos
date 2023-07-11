SUMMARY = "Haskell free profiling library"
DESCRIPTION = "This package provides the Haskell free profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-prof-5.1.10-2.6.aarch64.rpm"
RPM_HASH = "a22139ab89d3435f049ac0a62b3301b38e1184ab85c292aedb6e8a8bbea5902b016c478653fd21e69c9c912e6f0c6aa9c0bcefb154bdd06f3125cc9bd3d534ae"

RPROVIDES:${PN} += "ghc-free-prof \
ghc-prof-free-5.1.10-7AdTZukDGhL7qWMpdopXbC"

RDEPENDS:${PN} += "ghc-free-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-mtl-2.2.2 \
ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp"

inherit rpm
