SUMMARY = "Kan extensions, Kan lifts, the Yoneda lemma, and (co)density (co)monads"
DESCRIPTION = "Kan extensions, Kan lifts, various forms of the Yoneda lemma, and (co)density \
(co)monads."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-5.2.5-2.3.aarch64.rpm"
RPM_HASH = "ac9a082f4cb16e75c2a59bc49b89c1659681fd7af6b6ae1ebbf1e7ec5dcbd48cccedae3dfed65c146a52eeb080ba08880e7bd64a70d9270951d69ac494421d99"

RPROVIDES:${PN} += "ghc-kan-extensions \
libHSkan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSadjunctions-4.4.2-7RBwcclil4HKBSm6i086HA-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSfree-5.1.10-7AdTZukDGhL7qWMpdopXbC-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSinvariant-0.6.1-B19sct74tP6Cqvpbmm6WZv-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprofunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSsemigroups-0.20-KtsaS4jNcGkoC9puVZ6vB-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSvoid-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
