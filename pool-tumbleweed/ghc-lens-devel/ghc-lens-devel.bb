SUMMARY = "Haskell lens library development files"
DESCRIPTION = "This package provides the Haskell lens library development files."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-devel-5.2.2-1.6.aarch64.rpm"
RPM_HASH = "0b31b70318cefecbb914ea9cf26b3761acbfa75344466a4c26dbb348f85afb9e1bbcb4f36116398e60297def3afb9ad5995ba3518c735cdc2a460b61508011ad"

RPROVIDES:${PN} += "ghc-devel-lens-5.2.2-1olZqltPpYqDYPXthdjXjf \
ghc-lens-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-devel-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-free-5.1.10-7AdTZukDGhL7qWMpdopXbC \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ \
ghc-devel-kan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO \
ghc-devel-mtl-2.2.2 \
ghc-devel-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-devel-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-devel-reflection-2.1.7-KcOWE7PS1mHy6gA2edHvV \
ghc-devel-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-devel-strict-0.5-BMGWBclA5sg312fCUlbuTw \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-lens"

inherit rpm
