SUMMARY = "Haskell lens profiling library"
DESCRIPTION = "This package provides the Haskell lens profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-prof-5.2.2-1.6.aarch64.rpm"
RPM_HASH = "3813657227abc1d21941e9c7db9192ab951558ba391834956d1ff890b2d5714e56c105dd79d6f50ddefcfdef80b9b804507655d3329dd3070be94798c4295025"

RPROVIDES:${PN} += "ghc-lens-prof \
ghc-prof-lens-5.2.2-1olZqltPpYqDYPXthdjXjf"

RDEPENDS:${PN} += "ghc-lens-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-free-5.1.10-7AdTZukDGhL7qWMpdopXbC \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ \
ghc-prof-kan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO \
ghc-prof-mtl-2.2.2 \
ghc-prof-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-prof-reflection-2.1.7-KcOWE7PS1mHy6gA2edHvV \
ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-prof-strict-0.5-BMGWBclA5sg312fCUlbuTw \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
