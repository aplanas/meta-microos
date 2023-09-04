SUMMARY = "Haskell tasty-rerun profiling library"
DESCRIPTION = "This package provides the Haskell tasty-rerun profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-prof-1.1.18-6.5.aarch64.rpm"
RPM_HASH = "cb71f2df18f763afe5092a185abae13e9e398c0f38262a2211f916440d88b0a1d830b107e8af54f34f31d8e5abde6122fd353a0d5ead075c1b2d7cd056b0e0ea"

RPROVIDES:${PN} += "ghc-prof-tasty-rerun-1.1.18-1dvQzPS8A67DYD4eAA2wLL \
ghc-tasty-rerun-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-stm-2.5.1.0 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-prof-transformers-0.5.6.2 \
ghc-tasty-rerun-devel"

inherit rpm
