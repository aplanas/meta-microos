SUMMARY = "Haskell commonmark-extensions library development files"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-commonmark-extensions-devel-0.2.3.5-1.4.aarch64.rpm"
RPM_HASH = "7279607a608ce329786a086f101d44288f8043d959601e3bdbe0baf17df2a4c1bfb02da10bff2f242dbf02590aca57557edf880bf4544d41af3643a175da7789"

RPROVIDES:${PN} += "ghc-commonmark-extensions-devel \
ghc-devel-commonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-extensions \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR \
ghc-devel-containers-0.6.7 \
ghc-devel-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
