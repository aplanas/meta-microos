SUMMARY = "Haskell kan-extensions profiling library"
DESCRIPTION = "This package provides the Haskell kan-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-prof-5.2.5-2.6.aarch64.rpm"
RPM_HASH = "e3349cd95c71ae19b23e841b30091746d503e50e8499f643e1deeffde189aef3c2d3f6080c4c0bfeb513ed9cb7be7065f961cd998b403500f912e38ec29c2940"

RPROVIDES:${PN} += "ghc-kan-extensions-prof \
ghc-prof-kan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO"

RDEPENDS:${PN} += "ghc-kan-extensions-devel \
ghc-prof-adjunctions-4.4.2-7RBwcclil4HKBSm6i086HA \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-prof-free-5.1.10-7AdTZukDGhL7qWMpdopXbC \
ghc-prof-invariant-0.6.1-B19sct74tP6Cqvpbmm6WZv \
ghc-prof-mtl-2.2.2 \
ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd"

inherit rpm
