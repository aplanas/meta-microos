SUMMARY = "Haskell aeson profiling library"
DESCRIPTION = "This package provides the Haskell aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-prof-2.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "a4a6539c4eecc43ea60ff81f54e3fafa6159fc3c6e9989f8ea96e3d49c843f574a3eb7de198bba6dd8140c77e7e6db5a74981d73d433fd8d4b34eb117088112a"

RPROVIDES:${PN} += "ghc-aeson-prof \
ghc-prof-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP"

RDEPENDS:${PN} += "ghc-aeson-devel \
ghc-prof-OneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd \
ghc-prof-QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6 \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-dlist-1.0-BmTLN13CmmLQvuHz7BjP9 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-generically-0.1.1-9IDkuVjdBOA27Mdybf3GBx \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-semialign-1.2.0.1-LDzKW6eKwIG6WFTA9nak5m \
ghc-prof-strict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-these-1.1.1.1-3POHYes25uBIW53bcrDd39 \
ghc-prof-time-1.12.2 \
ghc-prof-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-witherable-0.4.2-3r5H0uqg5SQLafbMfCHwUh"

inherit rpm
