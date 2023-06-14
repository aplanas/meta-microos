SUMMARY = "Haskell lens profiling library"
DESCRIPTION = "This package provides the Haskell lens profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-prof-5.2.2-1.3.aarch64.rpm"
RPM_HASH = "31ea1d4d41cf0ea49457adb13699cfc2f051ea276b496d5603cdfe5108448321bf11cd146498117bb082bce90c04290e9581b53edd3768b6ee8647efdf5d6528"

RPROVIDES:${PN} += "ghc-lens-prof \
ghc-prof-lens-5.2.2-2MO0prnPqCQBRfua8fH2Ea"

RDEPENDS:${PN} += "ghc-lens-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-assoc-1.0.2-IAwklVGxRFw6xcadvaWWl7 \
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
ghc-prof-indexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO \
ghc-prof-kan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO \
ghc-prof-mtl-2.2.2 \
ghc-prof-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-prof-reflection-2.1.7-KcOWE7PS1mHy6gA2edHvV \
ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-prof-strict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-these-1.1.1.1-3POHYes25uBIW53bcrDd39 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
