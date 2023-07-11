SUMMARY = "Haskell aeson library development files"
DESCRIPTION = "This package provides the Haskell aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-devel-2.1.2.1-1.6.aarch64.rpm"
RPM_HASH = "b780bb2fb255de19a3639fa00907908b8dda7259f693f4082aa27616298abd62221efefd2bac468ce6804ce0d99de47d0ca582b77d7bf255bea79d0926e13f71"

RPROVIDES:${PN} += "ghc-aeson-devel \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson \
ghc-compiler \
ghc-devel-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV \
ghc-devel-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR \
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
ghc-devel-semialign-1.3-D9a6dNA89ZHcaXKxWN9Am \
ghc-devel-strict-0.5-BMGWBclA5sg312fCUlbuTw \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-devel-time-1.12.2 \
ghc-devel-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-witherable-0.4.2-JTGjjCVsQ4I7ks3qsHWAEH"

inherit rpm
