SUMMARY = "Haskell commonmark-extensions profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-commonmark-extensions-prof-0.2.3.5-1.4.aarch64.rpm"
RPM_HASH = "ccb08e8462fbe56b2035da4224b909361c74a33efecfc2b4564ed0373b1e59281a67989550cb62b5e931e5330623c7834306005c410af2d47cf59ef7b5ed9c78"

RPROVIDES:${PN} += "ghc-commonmark-extensions-prof \
ghc-prof-commonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr"

RDEPENDS:${PN} += "ghc-commonmark-extensions-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR \
ghc-prof-containers-0.6.7 \
ghc-prof-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
