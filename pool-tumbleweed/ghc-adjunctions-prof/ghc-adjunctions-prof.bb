SUMMARY = "Haskell adjunctions profiling library"
DESCRIPTION = "This package provides the Haskell adjunctions profiling library."
LICENSE = "BSD-2-Clause"

PV = "4.4.2"

RPM_NAME = "ghc-adjunctions-prof-4.4.2-2.3.aarch64.rpm"
RPM_HASH = "2e7a0a27ee0638b96ccc6d3226dddeccc447908a18314c37b30ba789ee0e9868125bbebc75d1b6d5fcd0b63d6d605447847a946c3f8bafeaa6ce9fe4f40e7d16"

RPROVIDES:${PN} += "ghc-adjunctions-prof \
ghc-prof-adjunctions-4.4.2-7RBwcclil4HKBSm6i086HA"

RDEPENDS:${PN} += "ghc-adjunctions-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-prof-free-5.1.10-7AdTZukDGhL7qWMpdopXbC \
ghc-prof-mtl-2.2.2 \
ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-prof-semigroups-0.20-KtsaS4jNcGkoC9puVZ6vB \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-void-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz"

inherit rpm
