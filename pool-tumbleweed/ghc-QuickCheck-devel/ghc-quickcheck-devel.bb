SUMMARY = "Haskell QuickCheck library development files"
DESCRIPTION = "This package provides the Haskell QuickCheck library development files."
LICENSE = "BSD-3-Clause"

PV = "2.14.3"

RPM_NAME = "ghc-QuickCheck-devel-2.14.3-1.3.aarch64.rpm"
RPM_HASH = "f3ff3fc71f3a2812398ad14b67a1d360a1963f324e60b653669df7b4b557c2de9fa332081cc4b8dea19194e856b2b1541d7bb7a957dd879b2b7db7100437f61e"

RPROVIDES:${PN} += "ghc-QuickCheck-devel \
ghc-devel-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-QuickCheck \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
