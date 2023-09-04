SUMMARY = "Haskell typst profiling library"
DESCRIPTION = "This package provides the Haskell typst profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-prof-0.1.0.0-1.10.aarch64.rpm"
RPM_HASH = "da33851c6f91f0e31122c27550b09c61ff67d0c59a3573a3d6f95f0bbfcd06c055457734bb7e31778ef3a73c0f728eb7bd510f42b8a414d55d93d60f59500700"

RPROVIDES:${PN} += "ghc-prof-typst-0.1.0.0-2jeJx4H6IsHkPaNZ5Ucvx \
ghc-typst-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-prof-containers-0.6.7 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-ordered-containers-0.2.3-2crAZfphMSgLuheOQx40mM \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-typst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-prof-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-typst-devel"

inherit rpm
