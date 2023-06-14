SUMMARY = "Haskell commonmark-pandoc profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-prof-0.2.1.3-2.2.aarch64.rpm"
RPM_HASH = "ef7e23388be3da88c543bf2221376c7e8d58a51c9fb93d296e1d27ba29c0a4116688bbe631b8277e3bcd1994d008be29b4e40e82d9dc8a73023410bbcd93e0fc"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-prof \
ghc-prof-commonmark-pandoc-0.2.1.3-FiR1R9G72Pe54eJfxxlumA"

RDEPENDS:${PN} += "ghc-commonmark-pandoc-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-commonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz \
ghc-prof-commonmark-extensions-0.2.3.4-fvyaRimQueHtxCz9MhD8e \
ghc-prof-pandoc-types-1.23-EFziwPO22I72D2SxHphq63 \
ghc-prof-text-2.0.2"

inherit rpm
