SUMMARY = "Haskell commonmark-pandoc library development files"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-devel-0.2.1.3-2.2.aarch64.rpm"
RPM_HASH = "957991fb964643aae333d5342424c158f3e1484a35d95abc1f213e435c8e1e83c5b01d2bddb3225665569c8c4ef8e7f3c91ca531bc41e6788742629f5fdb83da"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-devel \
ghc-devel-commonmark-pandoc-0.2.1.3-FiR1R9G72Pe54eJfxxlumA"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-pandoc \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-commonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz \
ghc-devel-commonmark-extensions-0.2.3.4-fvyaRimQueHtxCz9MhD8e \
ghc-devel-pandoc-types-1.23-EFziwPO22I72D2SxHphq63 \
ghc-devel-text-2.0.2"

inherit rpm
