SUMMARY = "Haskell sop-core library development files"
DESCRIPTION = "This package provides the Haskell sop-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-devel-0.5.0.2-4.6.aarch64.rpm"
RPM_HASH = "7d2a98abcb33672234135a81beb3ceaa5d089223194763975ad2622bd6750dbf5bf0b29ab56b4819a203d71ad8721eeaad0a38dd3086c745046e49ace0535e4d"

RPROVIDES:${PN} += "ghc-devel-sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe \
ghc-sop-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-sop-core"

inherit rpm
