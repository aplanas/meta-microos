SUMMARY = "Haskell commonmark-extensions profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.4"

RPM_NAME = "ghc-commonmark-extensions-prof-0.2.3.4-1.3.aarch64.rpm"
RPM_HASH = "8ff0748c85153d829818f2d3b08975246431fa267e5ea8e889330144a4d7c498b150920110ef131913c3f1dc78ebb0e1357d67e92a9683555ed39d8eef96efd1"

RPROVIDES:${PN} += "ghc-commonmark-extensions-prof \
ghc-commonmark-extensions-prof(aarch-64) \
ghc-prof(commonmark-extensions-0.2.3.4-fvyaRimQueHtxCz9MhD8e)"

RDEPENDS:${PN} += "ghc-commonmark-extensions-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(commonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz) \
ghc-prof(containers-0.6.7) \
ghc-prof(emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
