SUMMARY = "Haskell aeson library development files"
DESCRIPTION = "This package provides the Haskell aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-devel-2.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "799129b7c8f25a230093dfbb927016257d11a5ecc1f92ed864fe16f625ccdeb272208842caa4f557856b6c513ac51583c2db5febe6dbac525d2ece68fe6c36c6"

RPROVIDES:${PN} += "ghc-aeson-devel \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson \
ghc-compiler \
ghc-devel-OneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd \
ghc-devel-QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6 \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-dlist-1.0-BmTLN13CmmLQvuHz7BjP9 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-generically-0.1.1-9IDkuVjdBOA27Mdybf3GBx \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-semialign-1.2.0.1-LDzKW6eKwIG6WFTA9nak5m \
ghc-devel-strict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-these-1.1.1.1-3POHYes25uBIW53bcrDd39 \
ghc-devel-time-1.12.2 \
ghc-devel-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-witherable-0.4.2-3r5H0uqg5SQLafbMfCHwUh"

inherit rpm
