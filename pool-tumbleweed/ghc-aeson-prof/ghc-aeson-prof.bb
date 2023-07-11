SUMMARY = "Haskell aeson profiling library"
DESCRIPTION = "This package provides the Haskell aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-prof-2.1.2.1-1.6.aarch64.rpm"
RPM_HASH = "6a0afee1620e85b51138379dcb463df04f06c9ead9b95d0b6abc58463d839a9ca5feb4de51326d36f438d3ee4401817633f42880aef12c65fda578e48b4cbb84"

RPROVIDES:${PN} += "ghc-aeson-prof \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov"

RDEPENDS:${PN} += "ghc-aeson-devel \
ghc-prof-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV \
ghc-prof-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR \
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
ghc-prof-semialign-1.3-D9a6dNA89ZHcaXKxWN9Am \
ghc-prof-strict-0.5-BMGWBclA5sg312fCUlbuTw \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-prof-time-1.12.2 \
ghc-prof-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-witherable-0.4.2-JTGjjCVsQ4I7ks3qsHWAEH"

inherit rpm
