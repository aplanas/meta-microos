SUMMARY = "Haskell case-insensitive library development files"
DESCRIPTION = "This package provides the Haskell case-insensitive library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-devel-1.2.1.0-6.2.aarch64.rpm"
RPM_HASH = "0baf22c08ba6b71f5766db56444daf598fb1d6d2fff8773751d59e5b35bb009f1b01e2c181c8ec36ba0c070d23eda4b2b56f93c2a7b84b004b00e14927f8f93c"

RPROVIDES:${PN} += "ghc-case-insensitive-devel \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3"

RDEPENDS:${PN} += "/bin/sh \
ghc-case-insensitive \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-text-2.0.2"

inherit rpm
