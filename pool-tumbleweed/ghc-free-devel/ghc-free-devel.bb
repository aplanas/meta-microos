SUMMARY = "Haskell free library development files"
DESCRIPTION = "This package provides the Haskell free library development files."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-devel-5.1.10-2.3.aarch64.rpm"
RPM_HASH = "3d36b77d945d3acbe8bf98bb0c2d9244e09c5c81cb54504bb950580616315c7ceaf73c729fcebc02defff16f36fdcec72ded887f30f94e1b53f028d914902f99"

RPROVIDES:${PN} += "ghc-devel-free-5.1.10-7AdTZukDGhL7qWMpdopXbC \
ghc-free-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-devel-containers-0.6.7 \
ghc-devel-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-mtl-2.2.2 \
ghc-devel-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-devel-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-free"

inherit rpm
