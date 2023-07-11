SUMMARY = "Haskell commonmark-extensions library development files"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.4"

RPM_NAME = "ghc-commonmark-extensions-devel-0.2.3.4-1.7.aarch64.rpm"
RPM_HASH = "d6c5c516a5c185c9f915c876f2055c2bb2f8e4e8c5abdcd404a0abab8a2a4c4c51ccc44b4629b2b1b7b78e984f386c8083ce01fb27abce4f2dfb0bd6c58cf961"

RPROVIDES:${PN} += "ghc-commonmark-extensions-devel \
ghc-devel-commonmark-extensions-0.2.3.4-lgOKfz42TuIWz23FZS91J"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-extensions \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-devel-containers-0.6.7 \
ghc-devel-emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
