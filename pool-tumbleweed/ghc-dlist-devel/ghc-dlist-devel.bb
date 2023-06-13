SUMMARY = "Haskell dlist library development files"
DESCRIPTION = "This package provides the Haskell dlist library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-devel-1.0-3.2.aarch64.rpm"
RPM_HASH = "2ef0e245fcfecf6894313bcd32f85c9280b6b8b58a1fef4213f642d162fe515ea3dc401f6171c93f959bf57763743dedc856f56b11fb8b810307db43de1fe493"

RPROVIDES:${PN} += "ghc-devel(dlist-1.0-BmTLN13CmmLQvuHz7BjP9) \
ghc-dlist-devel \
ghc-dlist-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-dlist"

inherit rpm
