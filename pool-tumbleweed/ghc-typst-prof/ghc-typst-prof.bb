SUMMARY = "Haskell typst profiling library"
DESCRIPTION = "This package provides the Haskell typst profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-prof-0.1.0.0-1.11.aarch64.rpm"
RPM_HASH = "c904dee3b60cae7c1b3a764101d56429a6cc7a2ebf737527c2724c1e73db165c675535b7876a157befadab3fa61b6cbf8f8585157aaf6c8f84eea151f17e251e"

RPROVIDES:${PN} += "ghc-prof-typst-0.1.0.0-Fmp2IG7sNnSDScnnN1f3Kg \
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
ghc-prof-typst-symbols-0.1.4-JaoP2leChnCACsgYhrK1kO \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-prof-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-typst-devel"

inherit rpm
