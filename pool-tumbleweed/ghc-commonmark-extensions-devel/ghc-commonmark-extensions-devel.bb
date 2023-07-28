SUMMARY = "Haskell commonmark-extensions library development files"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-commonmark-extensions-devel-0.2.3.5-1.1.aarch64.rpm"
RPM_HASH = "6a17773b515c28d87585efc6064abf71268dbe5bcda7d50869d98b9f2fb1d297a913d1be8a709e52aa3b7dcb9681ca24c059f73b4915c57100f81a93010d0323"

RPROVIDES:${PN} += "ghc-commonmark-extensions-devel \
ghc-devel-commonmark-extensions-0.2.3.5-GeNUJwJZ0WZ7BXjQ8SYvXo"

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
