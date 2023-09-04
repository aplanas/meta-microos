SUMMARY = "Haskell typst library development files"
DESCRIPTION = "This package provides the Haskell typst library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-devel-0.1.0.0-1.10.aarch64.rpm"
RPM_HASH = "45d1f0334ba8d020e9efe59b8b1a32674f4feaa891a2a72b925aaef61959e246c6bace9483c6895db8e8d11041335a5781751736726a9ef8e11bf11eacf77d32"

RPROVIDES:${PN} += "ghc-devel-typst-0.1.0.0-2jeJx4H6IsHkPaNZ5Ucvx \
ghc-typst-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-devel-containers-0.6.7 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-ordered-containers-0.2.3-2crAZfphMSgLuheOQx40mM \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-devel-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-typst"

inherit rpm
