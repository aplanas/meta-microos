SUMMARY = "Haskell adjunctions library development files"
DESCRIPTION = "This package provides the Haskell adjunctions library development files."
LICENSE = "BSD-2-Clause"

PV = "4.4.2"

RPM_NAME = "ghc-adjunctions-devel-4.4.2-2.3.aarch64.rpm"
RPM_HASH = "5cd1fc7ce15a01567dbb51e805f765c6c11759dce444ceebb6aa217869c5f2ffdf5f0129964756e089f385a6b75f0a5d1a4a0ee4cb9afebe903532081abbdedd"

RPROVIDES:${PN} += "ghc-adjunctions-devel \
ghc-adjunctions-devel(aarch-64) \
ghc-devel(adjunctions-4.4.2-7RBwcclil4HKBSm6i086HA)"
RDEPENDS:${PN} += "/bin/sh \
ghc-adjunctions \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4) \
ghc-devel(containers-0.6.7) \
ghc-devel(contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao) \
ghc-devel(distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79) \
ghc-devel(free-5.1.10-7AdTZukDGhL7qWMpdopXbC) \
ghc-devel(mtl-2.2.2) \
ghc-devel(profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV) \
ghc-devel(semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1) \
ghc-devel(semigroups-0.20-KtsaS4jNcGkoC9puVZ6vB) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) \
ghc-devel(void-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz)"

inherit rpm
