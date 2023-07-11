SUMMARY = "Haskell kan-extensions library development files"
DESCRIPTION = "This package provides the Haskell kan-extensions library development files."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-devel-5.2.5-2.6.aarch64.rpm"
RPM_HASH = "d0abaa15bdd1c1878e9944cbca8a5bccdd558a3501fcaf11401583b56270c8b0988b4f7794c1b7e75aca7cbb20e299d7d018b1abdc8e5c86955cc46caf5c971e"

RPROVIDES:${PN} += "ghc-devel-kan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO \
ghc-kan-extensions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-adjunctions-4.4.2-7RBwcclil4HKBSm6i086HA \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-devel-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-devel-free-5.1.10-7AdTZukDGhL7qWMpdopXbC \
ghc-devel-invariant-0.6.1-B19sct74tP6Cqvpbmm6WZv \
ghc-devel-mtl-2.2.2 \
ghc-devel-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-devel-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-kan-extensions"

inherit rpm
