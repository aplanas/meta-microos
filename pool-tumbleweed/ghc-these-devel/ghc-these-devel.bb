SUMMARY = "Haskell these library development files"
DESCRIPTION = "This package provides the Haskell these library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "ghc-these-devel-1.2-1.3.aarch64.rpm"
RPM_HASH = "14a215fccc1d91ee89bb768eb4b8dbfeb9b5b5d8aff46c0aa1e2be0097aad4b29438cc9f51c942c8f2148af033a07ba4a3f6d957910a9aa6dcb44284847d0fd5"

RPROVIDES:${PN} += "ghc-devel-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-these-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-foldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-these"

inherit rpm
