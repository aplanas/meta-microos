SUMMARY = "Haskell commonmark-extensions profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-commonmark-extensions-prof-0.2.3.5-1.1.aarch64.rpm"
RPM_HASH = "0d09b7cf335fbe6ff005c986d3df0f957d9282c30891bb692d2a5bd4e9d38de41e0f9509202ff097e7edb6787d54df54f0f975e3075e79e8c4250b37b59c12d2"

RPROVIDES:${PN} += "ghc-commonmark-extensions-prof \
ghc-prof-commonmark-extensions-0.2.3.5-GeNUJwJZ0WZ7BXjQ8SYvXo"

RDEPENDS:${PN} += "ghc-commonmark-extensions-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-prof-containers-0.6.7 \
ghc-prof-emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
