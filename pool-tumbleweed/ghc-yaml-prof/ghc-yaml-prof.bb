SUMMARY = "Haskell yaml profiling library"
DESCRIPTION = "This package provides the Haskell yaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-prof-0.11.11.2-1.5.aarch64.rpm"
RPM_HASH = "638295b67503fd170848482f71e8deae23e7b5b31f23c1fb2552905b7b4752eb8036114863e2b1bf6f137943d96c5f0e51e82b9b70dbca2648fc7b2e4b0c25c1"

RPROVIDES:${PN} += "ghc-prof-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-yaml-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-libyaml-0.1.2-EDd2y61D5c93Khh6u4Ilj1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-yaml-devel"

inherit rpm
