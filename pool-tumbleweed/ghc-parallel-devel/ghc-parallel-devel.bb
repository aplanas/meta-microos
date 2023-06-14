SUMMARY = "Haskell parallel library development files"
DESCRIPTION = "This package provides the Haskell parallel library development files."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-devel-3.2.2.0-12.3.aarch64.rpm"
RPM_HASH = "5b49e9e5120de53f7fe1c3152ae1ce2d226882a0e6cf86c38998a8419c12655cebc5a962893da42263899387a7a9f51562dd570a6c2b5e6a743eece2d4786bcc"

RPROVIDES:${PN} += "ghc-devel-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-parallel-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-parallel"

inherit rpm
