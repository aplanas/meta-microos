SUMMARY = "Haskell commonmark profiling library"
DESCRIPTION = "This package provides the Haskell commonmark profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-commonmark-prof-0.2.2-2.3.aarch64.rpm"
RPM_HASH = "c7bc234a2e72482a901c4ade1833e846827f30391cc741145ea0dee6ca06a0c61e6801b0da1047fc3b6bdfdd874c8f8c9329937f836e1511a3f8117b3365fd19"

RPROVIDES:${PN} += "ghc-commonmark-prof \
ghc-prof-commonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz"

RDEPENDS:${PN} += "ghc-commonmark-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-prof-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO"

inherit rpm
